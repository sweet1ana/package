package DAO;

import abstractDAO.IUserDAO;
import dto.User;
import org.apache.log4j.Logger;
import util.MySQLConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//statement, prepared statemant, collable Statemant

/**
 * Created by svetlana on 23.04.2015.
 */
//@SuppressWarnings("ALL")
public class UserDAOImpl implements IUserDAO {
    private static final Logger LOGGER = Logger.getLogger(UserDAOImpl.class);

    private static Connection connection = MySQLConnectionUtil.getConnection();

    /**
     * Добавить объект User в БД
     *
     * @param user
     * @return
     */
    public boolean createUser(User user) {
        PreparedStatement statement = null;
        String sql = "";
        boolean check = false;

        LOGGER.info("Method start. Creating User with name: " + user.getEmail());

        try {
            sql = "INSERT INTO user " +
                    "(firstname, lastname, email, password) VALUES (?,?,?,?)";  //? - изменяемые входные параметры
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            int result = statement.executeUpdate();
            if (result > 0) {
                check = true;
            }
        } catch (SQLException e) {
            LOGGER.error("Create User with name: " + user.getEmail() + " was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        LOGGER.info("User with name: " + user.getEmail() + "was created.");

        return check;
    }

    /**
     * Выбрать из базы юзера по id
     *
     * @param id
     * @return
     */
    public User readUserByID(long id) {
        User user = new User();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "";

        LOGGER.info("Method start. Reading User by id: " + user.getUserID());

        try {
            sql = "SELECT userID, firstName, lastName, email, password " +
                    "FROM user WHERE userID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user.setUserID(resultSet.getLong("userID"));
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            LOGGER.error("Read User with id: " + user.getUserID() + " was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("User with id: " + user.getUserID() + "was reading.");

        return user;
    }

    /**
     * Выбрать всех юзеров
     *
     * @return
     */
    public List<User> readUsers() {
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "";
        List<User> usersList = new ArrayList<User>();

        LOGGER.info("Method start. Reading all Users.");

        try {
            sql = "SELECT userID, firstName, lastName, email, password FROM user";//перечислить поля
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet != null) {
                while (resultSet.next()) {
                    User user = new User();
                    user.setUserID(resultSet.getLong("userID"));
                    user.setFirstName(resultSet.getString("firstName"));
                    user.setLastName(resultSet.getString("lastName"));
                    user.setEmail(resultSet.getString("email"));
                    user.setPassword(resultSet.getString("password"));
                    usersList.add(user);
                }
            }
        } catch (SQLException e) {
            LOGGER.error("Read all Users was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("All Users were reading.");

        return usersList;
    }

    /**
     * Обновить юзера
     *
     * @param user
     */

    public void updateUser(User user) {
        PreparedStatement statement = null;
        String sql = "";

        LOGGER.info("Method start. Updating User with email: " + user.getEmail());

        try {
            sql = "UPDATE user " +
                    "SET firstName=?, lastName=?, email=?, password=? WHERE userID=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setLong(5, user.getUserID());
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error("Update User with mail: " + user.getEmail() + "was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("User with mail: " + user.getEmail() + "was updated.");

    }

    /**
     * Удалить юзера по id
     *
     * @param id
     */
    public void deleteUser(long id) {
        PreparedStatement statement = null;
        String sql = "";

        LOGGER.info("Method start. Deleting User with id: " + id);

        try {
            sql = "DELETE FROM user WHERE userID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error("Delete User with id: " + id + "was failed.");
            e.printStackTrace();
        }

        LOGGER.info("User with id: " + id + "was deleted.");

    }
}
