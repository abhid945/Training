import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Registration")
public class Registration  extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String firstName = req.getParameter("firstname");
        String lastName = req.getParameter("lastname");
        String city = req.getParameter("city");
        String education = req.getParameter("Education");
        Long mobile = Long.valueOf(req.getParameter("Mobile"));
        String email = req.getParameter("Email");
        String password = req.getParameter("password");


        boolean flag = true;
        for(int i=0;i<firstName.length();i++){
            if (firstName.charAt(i) >='A'&& firstName.charAt(i) <= 'Z' || firstName.charAt(i) >='a'&& firstName.charAt(i) <= 'z'){

                }
            else {
                flag = false;
            }
        }

        for(int i=0;i<lastName.length();i++){
            if (firstName.charAt(i) >='A'&& firstName.charAt(i) <= 'Z' || firstName.charAt(i) >='a'&& firstName.charAt(i) <= 'z'){

            }
            else {
                flag = false;
            }
        }

        for(int i=0;i<city.length();i++){
            if (firstName.charAt(i) >='A'&& firstName.charAt(i) <= 'Z' || firstName.charAt(i) >='a'&& firstName.charAt(i) <= 'z'){

            }
            else {
                flag = false;
            }
        }


        for(int i=0;i<education.length();i++){
            if (firstName.charAt(i) >='A'&& firstName.charAt(i) <= 'Z' || firstName.charAt(i) >='a'&& firstName.charAt(i) <= 'z'){

            }
            else {
                flag = false;
            }
        }

        for (int i=0;i)




        ServletContext application = req.getSession().getServletContext();
        application.setAttribute("Firstrname",firstName);
        application.setAttribute("LastName",lastName);
        application.setAttribute("City",city);
        application.setAttribute("Education",education);
        application.setAttribute("Mobile",mobile);
        application.setAttribute("Email",email);
        application.setAttribute("Password",password);

        Connection con = null;
        try {
            con = DatabaseConnection.initializeDatabase();
            PreparedStatement st = con.prepareStatement("insert into demo values(?, ?)");


            st.setString(1, req.getParameter(firstName));
            st.setString(2, req.getParameter(lastName));
            st.setString(3, req.getParameter(city));
            st.setString(4, req.getParameter(education));
            st.setLong(5, Long.parseLong(req.getParameter(String.valueOf(mobile))));
            st.setString(6, req.getParameter(email));
            st.setString(7, req.getParameter(password));
            st.executeUpdate();
            out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
