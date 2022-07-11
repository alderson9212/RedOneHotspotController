
import apimikrotik.ApiMikrotik;
import com.redone.modelos.HotspotUser;
import examples.ConexionMikrotik;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import me.legrange.mikrotik.ApiConnection;
import modelos.PerfilHotspotUser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elliot
 */
public class MetodosMikrotik {

    ConexionMikrotik conexion = new ConexionMikrotik();
    leerArchivo leerArchivo = new leerArchivo();
    protected ApiConnection con;

    public MetodosMikrotik() {
        con = conexion.getConection(leerArchivo.getHost(), leerArchivo.getUser(), leerArchivo.getPass());
    }

    public List<Map<String, String>> leerHotspotPerfiles() {
        List<Map<String, String>> results = new ArrayList<>();
        try {
            results = con.execute("/ip/hotspot/user/profile/print");
            for (Map<String, String> res :results) {
                System.out.printf("%s : %s\n", res.get("name"), res.get("keepalive-timeout"));

            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de perfiles:" + e.getMessage());
        }
        return results;
    }

    public List<Map<String, String>> crearPerfilHotspot(PerfilHotspotUser profile) {
         List<Map<String, String>> results = new ArrayList<>();
        try {
           results= con.execute("/ip/hotspot/user/profile/add name='" + profile.getName() + "'"
                    + " idle-timeout='" + profile.getIdle_timeout() + "'"
                    + " keepalive-timeout='" + profile.getKeepalive_timeout() + "'"
                    + " status-autorefresh=" + profile.getStatus_autorefresh() + ""
                    + " shared-users=" + profile.getShared_users()
                    + " add-mac-cookie=" + profile.isAdd_mac_cookie()
                    + " mac-cookie-timeout='" + profile.getMac_cookie_timeout() + "'"
                    + " parent-queue=none"
                    + " rate-limit=" + profile.getRate_limit()
                    + " on-login=:put(re,3000,12d,3000,,Enable return name");
              JOptionPane.showMessageDialog(null, "Perfil creado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear perfil:" + e.getMessage().replace(":", ""), "", JOptionPane.ERROR_MESSAGE);
        }
        return results;
    }

    public boolean eliminarPerfilHotspot(int numberProfile) {
        boolean bandera = false;
        try {
            con.execute("/ip/hotspot/user/profile/remove numbers=" + numberProfile);
            bandera = true;
            JOptionPane.showMessageDialog(null, "Perfil eliminado de manera correcta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar perfil:" + e.getMessage().replace(":", ""), "", JOptionPane.ERROR_MESSAGE);
        }
        return bandera;
    }
    
   public List<Map<String, String>> leerHotspotUsuarios() {
        List<Map<String, String>> results = new ArrayList<>();
        try {
            results = con.execute("/ip/hotspot/user/print");            
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de perfiles:" + e.getMessage());
        }
        return results;
    } 
   
   public List<HotspotUser> crearHotspotUsuariosFicha(int totalFichas,String perfil) {
        List<HotspotUser> resultados = new ArrayList<>();
        try {
            for(int i=0;i<totalFichas;i++){
                HotspotUser hotspot = new HotspotUser();
                String username=userGenerateFicha();
                String password = passGenerateFicha();
                con.execute("/ip/hotspot/user/add name="+username+" password="+password+" comment='coment' profile ='"+perfil+"'");            
                hotspot.setUsername(username);
                hotspot.setPassword(password);
                hotspot.setPerfil(perfil);
                resultados.add(hotspot);
            }
        } catch (Exception e) {
            System.out.println("Error al crear usuarios:" + e.getMessage());
        }
        return resultados;
    } 
   

   public String userGenerateFicha(){
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(6); 

        for (int m = 0; m < 6; m++) { 
            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        } 
        System.out.println("String generado:"+builder.toString());
        return builder.toString(); 
   }
   
     public String passGenerateFicha(){
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(6); 

        for (int m = 0; m < 6; m++) { 
            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        } 
        System.out.println("String generado pass:"+builder.toString());
        return builder.toString(); 
   }
}
