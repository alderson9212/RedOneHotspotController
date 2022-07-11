package examples;

import javax.net.SocketFactory;
import me.legrange.mikrotik.ApiConnection;

/**
 *
 * @author gideon
 */
 abstract class Example {
     
    protected void connect() throws Exception {
        
        con = ApiConnection.connect(SocketFactory.getDefault(), new leerArchivo().getHost(), ApiConnection.DEFAULT_PORT, 2000);
        con.login(new leerArchivo().getUser(),new leerArchivo().pass);
        System.out.println("Conectado:"+con.isConnected());
    }

    protected void disconnect() throws Exception {
        con.close();
    }
    
    protected ApiConnection con;
    
}
