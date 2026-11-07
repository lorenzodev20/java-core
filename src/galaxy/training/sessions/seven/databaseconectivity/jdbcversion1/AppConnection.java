package galaxy.training.sessions.seven.databaseconectivity.jdbcversion1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppConnection {
    static void main() {

        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1"; //Servidor, Puerto, Motor de base datos, base datos(servicio)
        String usu = "CURS-000646-JAVA-CORE";
        String pws = "123456";

        try {
            Class.forName(driver);
            System.out.println("Éxito al cargar el driver");
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println("Error al cargar el driver " + e.getMessage());
            return;
        }

        try {
            Connection connection = DriverManager.getConnection(url, usu, pws);
            System.out.println("Éxito de conexión a la db");
            // Select
            String sql = "SELECT LIBRO_ID, TITULO,RESUMEN, NRO_PAGINAS,ESTADO FROM  LIBRO";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {
                /*
                System.out.println(
                        rs.getInt(1) + "\t"
                        + rs.getString(2)+ "\t"
                        + rs.getString(3)+ "\t"
                        + rs.getInt(4)+ "\t"
                        + rs.getString(5)
                );*/
                /*
                System.out.println(
                        rs.getInt("LIBRO_ID") + "\t"
                                + + "\t"
                                + rs.getString("RESUMEN")+ "\t"
                                + rs.getInt("NRO_PAGINAS")+ "\t"
                                + rs.getString("ESTADO")
                );*/

                sb.append(rs.getInt("LIBRO_ID")).append("\t")
                        .append(rs.getString("TITULO")).append("\t")
                        .append(rs.getString("RESUMEN")).append("\t")
                        .append(rs.getString("NRO_PAGINAS")).append("\t")
                        .append(rs.getString("ESTADO"))
                        .append("\n");

            }
            System.out.println(sb);

        } catch (Exception e) {
            System.err.println("Error al conectar db " + e.getMessage());
        }

    }
}
