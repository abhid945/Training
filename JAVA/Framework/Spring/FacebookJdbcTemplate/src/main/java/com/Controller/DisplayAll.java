package com.Controller;

import com.Dao.DaoImplementation;
import com.bean.Facebook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/displayall")
public class DisplayAll extends HttpServlet {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("FacebookBean.xml");
    DaoImplementation daoImplementation = (DaoImplementation) applicationContext.getBean("facebookDao");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        List<Facebook> facebookList = daoImplementation.fetchAllUser();
        out.println("<html><head><!-- CSS only -->\n" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\"></head><body>");
        out.println("<center><div class='col-sm-8'><table class='table table-responsive'><thead class='table-dark'><tr><th>UserName</th><th>LastName</th><th>First Name</th>" +
                "<th>Age</th><th>Email</th></tr></thead><tbody>");
        for(Facebook facebook:facebookList)
        {
            out.println("<tr>");
                out.println("<td>"+facebook.getUsername()+"</td><td>"+facebook.getLastName()+"</td><td>"+
                        facebook.getLastName()+"</td><td>"+facebook.getAge()+"</td><td>"+facebook.getEmail()+"</td>");
            out.println("</tr>");
        }
        out.println("</div></center></body></html>");
    }
}
