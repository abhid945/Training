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


@WebServlet("/insert")
public class Insertservlet extends HttpServlet {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("FacebookBean.xml");
    DaoImplementation daoImplementation = (DaoImplementation) applicationContext.getBean("facebookDao");
   int resultset;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Facebook facebook = new Facebook();
        facebook.setUsername(req.getParameter("username"));
        facebook.setLastName(req.getParameter("lastName"));
        facebook.setFirstName(req.getParameter("firstName"));
        facebook.setAge(Integer.parseInt(req.getParameter("age")));
        facebook.setEmail(req.getParameter("email"));
        resultset = daoImplementation.insertUSer(facebook);
    }
}
