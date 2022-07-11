/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import me.legrange.mikrotik.ApiConnection;
import me.legrange.mikrotik.MikrotikApiException;

/**
 *
 * @author Elliot
 */
public class Host extends Example{

        
      public static void main(String...args) throws Exception {
            AllApis ex = new AllApis();
            ex.connect();
            ex.test();
            ex.disconnect();
        }
        
        public void test() throws MikrotikApiException {
            con.execute("/ip/hotspot/user/profile/add name=will idle-timeout=none keepalive-timeout=2m status-autorefresh=1m shared-users=1 add-mac-cookie=true mac-cookie-timeout=3d parent-queue=none rate-limit=512k/512k on-login=:put(re,3000,12d,3000,,Enable");
            con.execute("/ip/hotspot/user/profile/add name=will idle-timeout=none keepalive-timeout=2m status-autorefresh=1m shared-users=1 add-mac-cookie=true mac-cookie-timeout=3d parent-queue=none rate-limit=512k/512k on-login=:put(re,3000,12d,3000,,Enable");
            //con.execute("/ip/hotspot/user/add name=maunel password=wis profile=will");
        }
    
}
