package test1120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");   
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Config.DB_URL, Config.DB_USER, Config.DB_PASSWORD);
    }
}
