
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class crearArchivo {

   
    public void crearArchivoConexion(String host,String user,String pass) {
        try {
            String ruta = getHomeUser()+getSeparator()+"AppData"+getSeparator()+"Local"+getSeparator()+".redone";
            String contenido = "host="+host+"\n"+"user="+user+"\n"+"pass="+pass;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getHomeUser() {
        return System.getProperty("user.home");
    }

    private String getSeparator() {
        return System.getProperty("file.separator");
    }

}
