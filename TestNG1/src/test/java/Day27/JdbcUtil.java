package Day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    // Establish connection
    public void connect(String dbUrl, String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC Driver
        connection = DriverManager.getConnection(dbUrl, user, pass);
        statement = connection.createStatement();
    }

    // Execute a query
    public ResultSet executeQuery(String query) throws SQLException {
        resultSet = statement.executeQuery(query);
        return resultSet;
    }

    // Close all connections
    public void close() throws SQLException {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
}
