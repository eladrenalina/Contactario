package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;

/**
 * 
 * @author plbogado
 */
public class Threads extends Thread {

    boolean salir;
    String escritorio = System.getProperty("user.home") + "\\desktop";
    String origenConArchivo = "Agenda.csv";
    //Creamos carpeta del escritorio
    String carpetaDestino = escritorio + "\\CSVs";
    FileReader archivo;
    File origenArchivo, archivosCarpeta;
/**
 * 
 */
    @Override
    public void run() {
        try {
            File destino = new File(carpetaDestino);
            if (destino.exists()) {
              } else {
                System.out.println("directory already ");
                destino.mkdir();
            }
            archivo = new FileReader(new File(origenConArchivo));

            BufferedReader br = new BufferedReader(archivo);
            salir = false;

            while (!salir) {
                
                    DaoFactory factory=new DaoFactory();
                    
                    dao agendaParaImportaciones= factory.createJDBCServer_DAO();
                try {
                    String linea = br.readLine();
                    if (linea != null) {

                        String[] parte = linea.split("[, ;]");

                        String nombre = parte[0];
                        String apellido = parte[1];
                        String alias = parte[2];
                        String mail = parte[3];
                        String numero = parte[4];

                        System.out.println("Nombre: " + nombre);
                        System.out.println("Apellido: " + apellido);
                        
                        System.out.println("-Service Found-");

                        Contacts contactoCsv = new Contacts(nombre, apellido, alias, mail, numero);
                        
                        agendaParaImportaciones.agregar(contactoCsv);
                        //GestorDataBase cd = new GestorDataBase(contactoCsv);
                        //cd.agregar(contactoCsv);
                        System.out.println("Contact " + contactoCsv.getNombre() + " Has been added to Database");
                        
                        Threads.sleep(300);
                    }
                } catch (ArrayIndexOutOfBoundsException x) {
                    System.out.println("March Not Fund");
                }
            }
            moverArchivo(origenConArchivo, carpetaDestino + "./Files/Agenda.csv");
        } catch (FileNotFoundException e) {
              salir = true;
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void StopThread() {

        salir = true;
    }

    public void getfile(File carpeta) {

        File[] ficheros = carpeta.listFiles();
        for (int x = 0; x < ficheros.length; x++) {
            System.out.println(ficheros[x].getName());
        }

    }

    public void moverArchivo(String origena, String destinoa) {
        Path origenPath = FileSystems.getDefault().getPath(origena);
        Path destinoPath = FileSystems.getDefault().getPath(destinoa);

        JOptionPane.showMessageDialog(null, "already read, will move to " + destinoPath.toString());
        System.out.println("Move Successfully");
        try {
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
    public void ejemplo(String carpetaOrigen) throws IOException{
        String carpeta = "./"+carpetaOrigen;
        while(!salir){
            DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(carpeta),"*.csv");
            for(Path p : ds){
                
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }

}
}
