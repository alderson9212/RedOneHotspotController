package examples;

import me.legrange.mikrotik.MikrotikApiException;

/**
 * Example 1: A very simple command: Reboot the remote router
 * @author gideon
 */
public class AllApis extends Example {
    
        public static void main(String...args) throws Exception {
            AllApis ex = new AllApis();
            ex.connect();
            ex.con.execute("/ip/hotspot/user/profile/add name=will idle-timeout=none keepalive-timeout=2m status-autorefresh=1m shared-users=1 add-mac-cookie=true mac-cookie-timeout=3d parent-queue=none rate-limit=512k/512k on-login=:put(re,3000,12d,3000,,Enable");
            ex.disconnect();
        }
        
        public static void test() throws MikrotikApiException {
            
            //con.execute("/ip/hotspot/user/add name=willss password=wi profile=will");
        }

        ///
    /*
    /ip/hotspot/user/profile/add name="cahyo-cek-2" idle-timeout=none keepalive-timeout=2m status-autorefresh=1m shared-users=1 add-mac-cookie=true mac-cookie-timeout=3d parent-queue=none rate-limit=512k/512k on-login=:put (",re,3000,12d,3000,,Enable,");
    /system scheduler add name="usercahyo-cek-2-$user" interval=12:00:00 on-even="/ip hotspot active remove [find user=\"$user\"] ; /ip hotspot user set \"$user\" disable=yes ; /system scheduler remove [find name=usercahyo-cek-2-$user]"
*/
   
}
