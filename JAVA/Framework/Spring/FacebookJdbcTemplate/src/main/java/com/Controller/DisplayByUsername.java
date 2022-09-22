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

@WebServlet("/displaybyusername")
public class DisplayByUsername extends HttpServlet {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("FacebookBean.xml");
    DaoImplementation daoImplementation = (DaoImplementation) applicationContext.getBean("facebookDao");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
      String usernanme  = req.getParameter("username");
        List<Facebook> facebookList = daoImplementation.fetchbyUsername(usernanme);
        out.println(facebookList);

    }
}
