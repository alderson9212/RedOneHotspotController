/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author jdalt
 */
public class Pruebas {
    public static void main(String[] args) {
        FileOutputStream newFile = null;
        String nombre ="hora";
        System.out.println("Sentencia:"+"/ip/hotspot/user/profile/remove \""+nombre +"\"");
        
       /* try {
            File file = new File("C:\\Users\\jdalt\\OneDrive\\Escritorio\\HotspotContrller\\RedOneHotspotController\\build\\classes\\files\\ficha.pdf");
            byte[] filleBytes = FileUtils.readFileToByteArray(file);
            newFile = new FileOutputStream("C:\\Users\\jdalt\\OneDrive\\Escritorio\\HotspotContrller\\RedOneHotspotController\\build\\classes\\files\\filen.pdf");
            newFile.write(filleBytes);
            newFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                newFile.close();
            } catch (IOException ex) {
                Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }
}
