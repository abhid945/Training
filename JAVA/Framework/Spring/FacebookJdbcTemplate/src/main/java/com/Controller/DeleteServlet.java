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
import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("FacebookBean.xml");
    DaoImplementation daoImplementation = (DaoImplementation) applicationContext.getBean("facebookDao");
    int resultset;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Facebook facebook = new Facebook();
       String username = req.getParameter("username");
        resultset = daoImplementation.DeleteUser(username);
    }
}
