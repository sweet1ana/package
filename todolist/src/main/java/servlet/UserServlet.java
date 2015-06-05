package servlet;

import DAO.UserDAOImpl;
import abstractDAO.IUserDAO;
import dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class UserServlet extends HttpServlet {

    //виды сервлетов get, post, init, service, destroy
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        IUserDAO userDAO = new UserDAOImpl();
        List<User> userList = new ArrayList<User>();
        userList = userDAO.readUsers();


        req.setAttribute("userList", userList);
        getServletContext().getRequestDispatcher("/userList.jsp").forward(req, resp);
    }
}
