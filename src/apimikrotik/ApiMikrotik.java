/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apimikrotik;


import me.legrange.mikrotik.ApiConnection;

/**
 *
 * @author Elliot
 */
public class ApiMikrotik{

    /**
     * @param args the command line arguments
     */
    
    protected static ApiConnection con;
    
    public static void main(String... args) throws Exception {
        ApiMikrotik ex = new ApiMikrotik();
        ingre_user("will","usert", "hora");
    }
   protected static void ingre_user(String user,String pass,String plan){
        try {
          con.execute("/ip/hotspot/user/add name="+user+" password="+pass+" profile="+plan); 
            System.out.println("exitoso");
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        
   }
    
}
