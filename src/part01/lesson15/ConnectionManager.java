package part01.lesson15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    private static String dbDriver = "org.postgresql.Driver";
    private static String dbLogin = "root";
    private static String dbPassword = "root";
    private static String url = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName(dbDriver);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Properties prop = new Properties();
        prop.setProperty("driver", dbDriver);
        prop.setProperty("login", dbLogin);
        prop.setProperty("password", dbPassword);

        return DriverManager.getConnection(url, prop);

    }


}
