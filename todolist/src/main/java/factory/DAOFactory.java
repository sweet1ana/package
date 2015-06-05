package factory;

import abstractDAO.IStatusDAO;
import abstractDAO.ITaskDAO;
import abstractDAO.IUserDAO;

/**
 * Created by svetlana on 23.04.2015.
 */
public abstract class DAOFactory {

    public static final int MY_SQL = 1;
    public static final int ORACLE = 2;
    public static final int LDAP = 3;

    public abstract IUserDAO getUserDAO();

    public abstract ITaskDAO getTaskDAO();

    public abstract IStatusDAO getStatusDAO();

    public static DAOFactory getDaoFactory(int factoryName) {
        switch (factoryName) {
            case MY_SQL:
                return new MySQLDAOFactory();
            case ORACLE:
                return new OracleDAOFactory();
            case LDAP:
                return new LDAPDAOFactory();
            default:
                return null;
        }
    }
}
