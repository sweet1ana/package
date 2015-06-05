package DAO;

import abstractDAO.IStatusDAO;
import dto.Status;
import dto.Task;
import org.apache.log4j.Logger;
import util.MySQLConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StatusDAOImpl implements IStatusDAO {
    private static final Logger LOGGER = Logger.getLogger(UserDAOImpl.class);

    private static Connection connection = MySQLConnectionUtil.getConnection();

    public boolean createStatus(Status status) {

        LOGGER.info("Method start. Creating Status with id: " + status.getStatusID());

        PreparedStatement statement = null;
        String sql = "";
        boolean check = false;

        try {
            sql = "INSERT INTO status " +
                    "(taskID, workStatus) VALUES (?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, status.getTaskID());
            statement.setString(2, status.getWorkStatus());
            int result = statement.executeUpdate();
            if (result > 0) {
                check = true;
            }
        } catch (SQLException e) {
            LOGGER.error("Create Status with id: " + status.getStatusID() + " was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        LOGGER.info("Status with id: " + status.getStatusID() + "was created.");

        return check;
    }

    public Status readStatusByID(long id) {
        Status status = new Status();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "";

        LOGGER.info("Method start. Reading Status by id: " + status.getStatusID());

        try {
            sql = "SELECT statusID, taskID, workStatus " +
                    "FROM status WHERE statusID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                status.setStatusID(resultSet.getLong("statusID"));
                status.setTaskID(resultSet.getLong("taskID"));
                status.setWorkStatus(resultSet.getString("workStatus"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error("Read Status with id: " + status.getStatusID() + " was failed.");
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("Status with id: " + status.getStatusID() + "was reading.");

        return status;
    }

    public List<Status> readStatuses() {
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "";
        List<Status> statusList = new ArrayList<Status>();

        LOGGER.info("Method start. Reading all Statuses.");

        try {
            sql = "SELECT statusID, taskID, workStatus FROM status";//перечислить поля
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet != null) {
                while (resultSet.next()) {
                    Status status = new Status();
                    status.setStatusID(resultSet.getLong("statusID"));
                    status.setTaskID(resultSet.getLong("taskID"));
                    status.setWorkStatus(resultSet.getString("workStatus"));
                    statusList.add(status);
                }
            }
        } catch (SQLException e) {
            LOGGER.error("Read all Statuses was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("All Statuses were reading.");

        return statusList;
    }


    public void updateStatus(Status status) {
        PreparedStatement statement = null;
        String sql = "";

        LOGGER.info("Method start. Updating Status with id: " + status.getStatusID());

        try {
            sql = "UPDATE status " + "SET taskID=?, workStatus=? WHERE statusID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, status.getTaskID());
            statement.setString(2, status.getWorkStatus());
            statement.setLong(3, status.getStatusID());
        } catch (SQLException e) {
            LOGGER.error("Update Status with id: " + status.getStatusID() + "was failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        LOGGER.info("Status with id: " + status.getStatusID() + "was updated.");

    }

    public void deleteStatus(long id) {
        PreparedStatement statement = null;
        String sql = "";

        LOGGER.info("Method start. Deleting Status with id: " + id);

        try {
            sql = "DELETE FROM status WHERE statusID=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error("Delete Status with id: " + id + "was failed.");
            e.printStackTrace();
        }

        LOGGER.info("Status with id: " + id + "was deleted.");

    }
}
