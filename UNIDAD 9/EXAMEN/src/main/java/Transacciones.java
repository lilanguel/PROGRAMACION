import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        insertarPedido();
    }

    public static void insertarPedido() {
        Connection connection = ConexionDB.getConnection();

        try {
            connection.setAutoCommit(false);

            Connection con = ConexionDB.getConnection();

            String sql1 = "INSERT INTO orders VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement1 = con.prepareStatement(sql1);

            statement1.setInt(1, 10429);
            statement1.setString(2, "2005-06-01");
            statement1.setString(3, "2005-06-09");
            statement1.setString(4, null);
            statement1.setString(5, "In Process");
            statement1.setString(6, null);
            statement1.setInt(7, 119);

            statement1.executeUpdate();

            String sql2 = "INSERT INTO orderdetails VALUES (?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            statement2.setInt(1, 10429);
            statement2.setString(2, "S32_2509");
            statement2.setInt(3, 5);
            statement2.setDouble(4, 80.03);
            statement2.setInt(5, 2);

            statement2.executeUpdate();

            String sql3 = "INSERT INTO orderdetails VALUES (?,?,?,?,?)";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            statement3.setInt(1, 10429);
            statement3.setString(2, "S12_4473");
            statement3.setInt(3, 3);
            statement3.setDouble(4, 60.63);
            statement3.setInt(5, 2);

            statement3.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException exc) {
                exc.printStackTrace();
            }
        }
    }
}
