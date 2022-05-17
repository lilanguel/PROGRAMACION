import java.sql.*;

public class ConexionDB {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (connection);
    }

    public static void close() {
        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}