package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by svetlana on 27.04.2015.
 */
public class MySQLConnectionUtil {

    private static final String USER = "root";
    private static final String PASSWORD = "Rheingold2004";
    private static final String URL = "jdbc:mysql://localhost:3306/todo";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
