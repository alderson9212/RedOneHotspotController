/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.swing.JOptionPane;
import me.legrange.mikrotik.ApiConnection;
import me.legrange.mikrotik.ApiConnectionException;
import me.legrange.mikrotik.MikrotikApiException;

/**
 *
 * @author Elliot
 */
public class ConexionMikrotik {
    
      protected ApiConnection con;
      
      public ApiConnection getConection(String ip,String user,String password){
          try {
              con = ApiConnection.connect(SocketFactory.getDefault(),ip, ApiConnection.DEFAULT_PORT, 2000);
              con.login(user,password);
          } catch (MikrotikApiException ex) {
              System.out.println("Error de conexion:"+ex.getMessage());
               JOptionPane.showMessageDialog(null,ex.getMessage(),"",JOptionPane.ERROR_MESSAGE);
          }
        return con;
      }
      
      public void closeConection(){
          try {
              con.close();
          } catch (ApiConnectionException ex) {
              Logger.getLogger(ConexionMikrotik.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    
}
