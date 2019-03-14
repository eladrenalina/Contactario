package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author plbogado
 */
public class Single_Conn {

    private static Connection conn = null;

    public static Connection getConnection() {
        String url = "jdbc:derby://localhost:1527/Agenda";
        String usuario = "agenda";
        String pass = "agenda";
        try {

            if (conn == null) {
                conn = DriverManager.getConnection(url, usuario, pass);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage() + "");
        }

        return conn;

    }
}
