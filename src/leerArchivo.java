
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elliot
 */
public class leerArchivo {

    String fichero = ".redone";
    String host = "";
    String user = "";
    String pass = "";

    public leerArchivo() {
        readFile();
    }

    private File getFile() {
       String ruta = getHome()+getSeparator()+"AppData"+getSeparator()+"Local"+getSeparator()+".redone";
        File file = new File(ruta);
        if (file.exists()) {
            return file;
        } else {
            System.out.println("El fichero no existe: " + ruta);
            return null;
        }
    }

    private void readFile() {
        if (getFile()!= null) {
            try {
                try (FileReader fileReader = new FileReader(getFile())) {
                    BufferedReader br = new BufferedReader(fileReader);
                    String line;
                    while ((line = br.readLine()) != null) {
                        readLines(line);
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception to read file " + fichero + ":" + e);
            }
        } else {
            System.out.println("File not found");
        }
    }

    private void readLines(String line) {
        if (line.contains("host")) {
            host = line.split("=")[1];
        }
        if (line.contains("user")) {
            user = line.split("=")[1];
        }
        
         if (line.contains("pass")) {
            pass = line.split("=")[1];
        }
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }
    
    public String getPass() {
        return pass;
    }

    private String getHome() {
        return System.getProperty("user.home");
    }

    private String getSeparator() {
        return System.getProperty("file.separator");
    }
}
