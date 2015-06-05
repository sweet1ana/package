import DAO.UserDAOImpl;
import dto.User;
import factory.DAOFactory;
import factory.MySQLDAOFactory;
import util.MySQLConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by svetlana on 05.05.2015.
 */
public class Test {

    public static void main(String[] args) {

        UserDAOImpl userDAO = new UserDAOImpl();
        //User user = new User();

        // System.out.print(user);

        //create
        User user1 = new User("test","test","test@rambler.ru","test");
        System.out.println(userDAO.createUser(user1));

        //read
        // user = userDAO.readUserByID(1);

        List<User> userList = new ArrayList<User>();
         userList = userDAO.readUsers();

        //update
        // User user2 = new User("Julia","Roberts","julia@gmail.com","qwe123",4);
        // userDAO.updateUser(user2);

        //delete
        // userDAO.deleteUser(5);

        System.out.println(userList);
    }
}
