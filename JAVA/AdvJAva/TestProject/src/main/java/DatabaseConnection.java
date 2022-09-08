import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql:// localhost:3306/Verification";
        // Database name to access
        String dbName = "Test";
        String dbUsername = "root";
        String dbPassword = "Abhiid945@";

           Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                dbUsername,
                dbPassword);
        return con;
    }
}