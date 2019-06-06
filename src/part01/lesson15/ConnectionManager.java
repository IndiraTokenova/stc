package part01.lesson15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    private static String dbDriver = "com.mysql.jdbc.Driver";
    private static String dbServer;
    private static String dbLogin;
    private static String dbPassword;

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName(dbDriver);
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }

        Properties prop = new Properties();
        prop.setProperty("driver", dbDriver);
        prop.setProperty("login", dbLogin);
        prop.setProperty("password", dbPassword);

        return (Connection) DriverManager.getConnection(dbServer, prop);

    }



}
