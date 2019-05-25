package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookieServlet", urlPatterns = "/cookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieParam = request.getParameter("cookie");
        for (Cookie cookie : request.getCookies()) {
            cookie.getName();
            cookie.getValue();
        }


        if ("create".equals(cookieParam)) {



        } else if ("print".equals(cookieParam)){



        } else if ("remove".equals(cookieParam)){



        }

    }
}
