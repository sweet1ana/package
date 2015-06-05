package factory;

import DAO.StatusDAOImpl;
import DAO.TaskDAOImpl;
import DAO.UserDAOImpl;
import abstractDAO.IStatusDAO;
import abstractDAO.ITaskDAO;
import abstractDAO.IUserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by svetlana on 23.04.2015.
 */
public class MySQLDAOFactory extends DAOFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/todo";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "Rheingold2004";

    public MySQLDAOFactory() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public IUserDAO getUserDAO() {
        return new UserDAOImpl();
    }

    @Override
    public ITaskDAO getTaskDAO() {
        return new TaskDAOImpl();
    }

    @Override
    public IStatusDAO getStatusDAO() {
        return new StatusDAOImpl();
    }
}
