package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {
    private static final String URL = "jdbc:mariadb://localhost:3306/koperasi"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private static final Logger logger = Logger.getLogger(DBUtil.class.getName());

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Koneksi ke database gagal: ", e);
            throw e; // Melempar ulang exception setelah log
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            logger.log(Level.WARNING, "Gagal menutup koneksi: ", e);
        }
    }
}
