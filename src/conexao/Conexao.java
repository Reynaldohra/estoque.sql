package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String url = "jdbc:mysql://localhost:3306/clientes.sql";
    private static String user = "root";
    private static String password = "AdminReynaldo";

    private static Connection conn;

    public static Connection getConexao() {
        try {

            if (conn == null) {

                conn = DriverManager.getConnection(url, user, password);
            } else {
                return conn;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;

    }
}
