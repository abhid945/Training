import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Login")
public class Login extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        ServletContext application = request.getSession().getServletContext();
        application.setAttribute("Username",username);


        if(validate.checkUser(username,pass,application))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
        }
        else
        {
            out.println("Username or Password1 incorrect");
            RequestDispatcher rs = request.getRequestDispatcher("Index.html");
            rs.include(request,response);

        }
    }
}