package examples;

import java.util.List;
import java.util.Map;
import me.legrange.mikrotik.MikrotikApiException;

/**
 * Example to show that different character sets may work some times. 
 *
 * @author gideon
 */
public class AñadirUsuariosHotSprot extends Example {
    
    private static final String JAPANESE = "事報ハヤ久送とゅ歳用ト候新放すルドう二5春園ユヲロ然納レ部悲と被状クヘ芸一ーあぽだ野健い産隊ず";
    private static final String CRYLLIC = "Лорем ипсум долор сит амет, легере елояуентиам хис ид. Елигенди нолуиссе вих ут. Нихил";
    private static final String ARABIC = "تجهيز والمانيا تم قام. وحتّى المتاخمة ما وقد. أسر أمدها تكبّد عل. فقد بسبب ترتيب استدعى أم, مما مع غرّة، لأداء. الشتاء، عسكرياً";

    public static void main(String... args) throws Exception {
        AñadirUsuariosHotSprot ex = new AñadirUsuariosHotSprot();
        ex.connect();
        ex.test();
        ex.disconnect();
    }

    private void test() throws MikrotikApiException {
        //1.-añadir perfil de usuario
       //List<Map<String, String>> profile =  con.execute("/ip/hotspot/user/profile/add name=will1 1 idle-timeout=none keepalive-timeout=2m status-autorefresh=1m shared-users=1 add-mac-cookie=true mac-cookie-timeout=3d parent-queue=none rate-limit=512k/512k on-login=:put(re,3000,12d,3000,,Enable");
        //2.-ver usuarios
       /* List<Map<String, String>> results =  con.execute("/ip/hotspot/user/print/");
         for (Map<String, String> result : results) {
            System.out.println(result);
        }*/
       //3.-Imprimir perfiles
        /*List<Map<String, String>> results =  con.execute("/ip/hotspot/user/profile/print");
         for (Map<String, String> result : results) {
            System.out.println(result);
        }*/
       
        //3.-añadir usuario
        con.execute("/ip/hotspot/user/add name=user1 password=2133 comment='" + "user12" + "' profile ='hora' ");
       //4.-añadir un binding para usuarios personalizados
        //ip-binding add mac-addres 89:89:4f:67:25:12 server all comment mio
        //5.- ver usuarios activos
        /*for (Map<String, String> res : con.execute("/ip/hotspot/active/print")) {
            System.out.printf("%s : %s\n", res.get("user"), res.get("address"));
        }
        */
        
        ///retornar campos
       /* for (Map<String, String> res : con.execute("/ip/hotspot/user/print ")) {
            System.out.printf("%s : %s\n", res.get("name"), res.get("number"));
            
        }*/
    
    }
    
    
}
