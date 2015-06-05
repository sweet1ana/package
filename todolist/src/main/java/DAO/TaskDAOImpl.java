package DAO;

import abstractDAO.ITaskDAO;
import dto.Task;
import dto.User;
import org.apache.log4j.Logger;
import util.MySQLConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TaskDAOImpl implements ITaskDAO {
    private static final Logger LOGGER = Logger.getLogger(UserDAOImpl.class);

    private static Connection connection = MySQLConnectionUtil.getConnection();

    public boolean createTask(Task task) {
        PreparedStatement statement = null;
        String sql = "";
        boolean check = false;

        LOGGER.info("Method start. Creating Task with name: " + task.getNameTask());

        try {
            sql = "INSERT INTO task " +
                    "(userID, nameTask, description) VALUES (?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, task.getUserID());
            statement.setString(2, task.getNameTask());
            statement.setString(3, task.getDescription());
            int result = statement.executeUpdate();
            if (result > 0) {
                check = true;
            }
        } catch (SQLException e) {
            LOGGER.error("Create Task with name: " + task.getNameTask() + " was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("Task with name: " + task.getNameTask() + "was created.");

        return check;
    }

    public Task readTaskByID(long id) {
        Task task = new Task();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "";

        LOGGER.info("Method start. Reading Task by id: " + task.getTaskID());

        try {
            sql = "SELECT taskID, userID, nameTask, description " +
                    "FROM task WHERE taskID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                task.setTaskID(resultSet.getLong("taskID"));
                task.setUserID(resultSet.getLong("userID"));
                task.setNameTask(resultSet.getString("nameTask"));
                task.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException e) {
            LOGGER.error("Read Task with id: " + task.getTaskID() + " was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("Task with id: " + task.getTaskID() + "was reading.");

        return task;
    }

    public List<Task> readTasks() {
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "";
        List<Task> taskList = new ArrayList<Task>();

        LOGGER.info("Method start. Reading all Tasks.");

        try {
            sql = "SELECT taskID, userID, nameTask, description FROM task";//перечислить поля
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet != null) {
                while (resultSet.next()) {
                    Task task = new Task();
                    task.setTaskID(resultSet.getLong("taskID"));
                    task.setUserID(resultSet.getLong("userID"));
                    task.setNameTask(resultSet.getString("nameTask"));
                    task.setDescription(resultSet.getString("description"));
                    taskList.add(task);
                }
            }
        } catch (SQLException e) {
            LOGGER.error("Read all Tasks was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("All Tasks were reading.");

        return taskList;
    }

    public void updateTask(Task task) {
        PreparedStatement statement = null;
        String sql = "";

        LOGGER.info("Method start. Updating User with name: " + task.getNameTask());

        try {
            sql = "UPDATE task " + "SET userID=?, nameTask=?, description=? WHERE taskID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, task.getUserID());
            statement.setString(2, task.getNameTask());
            statement.setString(3, task.getDescription());
            statement.setLong(4, task.getTaskID());
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error("Update Task with name: " + task.getNameTask() + "was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("Task with name: " + task.getNameTask() + "was updated.");

    }

    public void deleteTask(long id) {
        PreparedStatement statement = null;
        String sql = "";

        LOGGER.info("Method start. Deleting Task with id: " + id);

        try {
            sql = "DELETE FROM task WHERE taskID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error("Delete Task with id: " + id + "was failed.");
            e.printStackTrace();
        }

        LOGGER.info("Task with id: " + id + "was deleted.");

    }
}
