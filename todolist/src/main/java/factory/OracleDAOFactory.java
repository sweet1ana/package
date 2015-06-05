package factory;

import abstractDAO.IStatusDAO;
import abstractDAO.ITaskDAO;
import abstractDAO.IUserDAO;

/**
 * Created by svetlana on 23.04.2015.
 */
public class OracleDAOFactory extends DAOFactory {
    @Override
    public IUserDAO getUserDAO() {
        return null;
    }

    @Override
    public ITaskDAO getTaskDAO() {
        return null;
    }

    @Override
    public IStatusDAO getStatusDAO() {
        return null;
    }
}
