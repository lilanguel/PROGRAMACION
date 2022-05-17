import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static void main(String[] args) throws SQLException {
        System.out.println(getProductLines());
        categoriaMasVendida();
    }

    public static List<ProductLine> getProductLines() throws SQLException {
        List<ProductLine> listaLineaDeProductos = new ArrayList<>();

        Connection con = ConexionDB.getConnection();

        String sql = "select * from productlines";
        PreparedStatement statement = con.prepareStatement(sql);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String productLine = rs.getString("productLine");
            String textDescription = rs.getString("textDescription");
            String htmlDescription = rs.getString("htmlDescription");
            String image = rs.getString("image");

            ProductLine productLine1 = new ProductLine(productLine, textDescription, htmlDescription, image);
            listaLineaDeProductos.add(productLine1);
        }

        return listaLineaDeProductos;
    }

    public static void categoriaMasVendida() throws SQLException {
        Connection con = ConexionDB.getConnection();

        String sql = "SELECT p.productLine , COUNT(o.productCode)  \n" +
                "from products p inner join orderdetails o \n" +
                "on p.productCode = o.productCode \n" +
                "group by p.productLine\n" +
                "order by COUNT(o.productCode) desc\n" +
                "limit 1;";

        PreparedStatement statement = con.prepareStatement(sql);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String productLine = rs.getString("productLine");
            System.out.println(productLine);
        }
    }
}