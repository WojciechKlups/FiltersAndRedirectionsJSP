package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",
            urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {

    private static final String USERNAME = "Wojtek";
    private static final String PASSWORD = "admin";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Object username = request.getParameter("username");
        Object password = request.getParameter("password");
        if (username.equals(USERNAME) && password.equals(PASSWORD)){
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
        }
        response.sendRedirect("/admin.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        System.out.println("LoginServlet GET: " + username);
    }
}
