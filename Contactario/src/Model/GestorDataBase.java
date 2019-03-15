package Model;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author plbogado
 */

public class GestorDataBase implements dao {

    public GestorDataBase() {
    }

    public GestorDataBase(Contacts c) {
    }
    String[] filas;
   // Connection conn= Conn.Singl_postgres.getConnection();
    Connection conn = Conn.Single_Conn.getConnection();
    Statement sc;
    PreparedStatement ac;
    List lista;
    DefaultTableModel model;
    String busqueda;
    ResultSet rs;
    int cantidad;

    final String add = "insert into contacto(nombre,apellido,alias,email,telefono) VALUES(?,?,?,?,?)";
    final String viewall = "select * from contacto";
    final String update = "update contacto set NOMBRE=? , APELLIDO=? , ALIAS= ? , EMAIL= ? ,TELEFONO= ? WHERE id=?";
    final String delete = "delete from contacto where id= ?";
    final String count = "select count(*) 'COUNT' from contacto";
    String BUSCAR = "select * from Contacto WHERE nombre LIKE  '%" + busqueda + "%'";

    @Override
    public void agregar(Contacts c) {
        try {

            ac = conn.prepareStatement(add);
            ac.setString(1, c.getNombre());
            ac.setString(2, c.getApellido());
            ac.setString(3, c.getAlias());
            ac.setString(4, c.getMail());
            ac.setString(5, c.getTelefono());

            int n = ac.executeUpdate();

            if (n > 0) {
                System.out.println("Contact has been added Successfully");
                ac.close();
            }
        } catch (SQLException e) {
            System.out.println("Fail, one or more not Working");
            e.printStackTrace();
        } finally{
            if(ac != null){
                try {
                    ac.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorDataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        cantidad = contarTodos();
    }
    @Override
    public void modificar(Contacts c, int mod) {

        try {
            ac = conn.prepareStatement(update);

            ac.setString(1, c.getNombre());
            ac.setString(2, c.getApellido());
            ac.setString(3, c.getAlias());
            ac.setString(4, c.getMail());
            ac.setString(5, c.getTelefono());
            ac.setInt(6, mod);
            System.out.println(mod);
            ac.executeUpdate();

            int n = ac.executeUpdate();

            System.out.println("Mod");
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "date of contact N° " + mod + " \n has been update", "Update Completed", 1);
                System.out.println("has been update...");

                ac.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fail");
        }finally{
            if(ac != null){
                try {
                    ac.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorDataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void mostrarTodos() {
        try {

            String[] titulos = {"ID", "Name", "Last Name", "Ncik", "E-mail", "Phone"};
            model = new DefaultTableModel(null, titulos);
            sc = conn.createStatement();
            rs = sc.executeQuery(viewall);
            filas = new String[6];
            while (rs.next()) {

                filas[0] = rs.getString("Id");
                filas[1] = rs.getString("Nombre");
                filas[2] = rs.getString("Apellido");
                filas[3] = rs.getString("Alias");
                filas[4] = rs.getString("Email");
                filas[5] = rs.getString("Telefono");

                System.out.println(filas[0] + "  " + filas[1] + "  " + filas[2] + "  "
                        + filas[3] + "  " + filas[4] + "  " + filas[5]);
                model.addRow(filas);
            }
            int contador = contarTodos();
            System.out.println(contador);
        } catch (SQLException e) {
        }finally{
            if(ac != null){
                try {
                    ac.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorDataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void eliminar(String id) {
        try {
            ac = conn.prepareStatement(delete);
            ac.setString(1, id);
            ac.executeUpdate();
            int n = ac.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "deleted successfully");
                ac.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el contacto");
            e.printStackTrace();
        }
        finally{
            if(ac != null){
                try {
                    ac.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorDataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    @Override
    public void buscar(String buscar) {
        try {
            System.out.println("search to..." + buscar);
            String[] titulos = {"Id", "Nombre", "Apellido", "Alias", "EMAIL", "Telefono"};
            model = new DefaultTableModel(null, titulos);
            ac = conn.prepareStatement("SELECT * FROM CONTACTO where NOMBRE like  '%" + buscar + "%'");
            rs = ac.executeQuery();
            filas = new String[6];
            if(rs.next()==true){
            while (rs.next()) {

                filas[0] = rs.getString("ID");
                filas[1] = rs.getString("NOMBRE");
                filas[2] = rs.getString("APELLIDO");
                filas[3] = rs.getString("ALIAS");
                filas[4] = rs.getString("Email");
                filas[5] = rs.getString("Telefono");
                String nombre = filas[1];
                String apellido = filas[2];
                String alias = filas[3];
                System.out.println(nombre + "  " + alias + "   " + apellido);

                model.addRow(filas);
                System.out.println("");
                rs.close();
            }
            }else{
            JOptionPane.showMessageDialog(null,"No hay registros con ese nombre");
            }
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "algo salio mal en la busqueda");
            e.printStackTrace();
            
        }finally{
            if(ac != null){
                try {
                    ac.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorDataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public int contarTodos() {
        cantidad = 0;
        try {
            sc = conn.createStatement();
            rs = sc.executeQuery(count);
            while (rs.next()) {
                cantidad = rs.getInt("Count");
            }
        } catch (SQLException e) {
            
           
        }
        return cantidad;
    }
}
