/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Elliot
 */
public class PerfilHotspotUser {
    
    private String name;
    private String idle_timeout;
    private String keepalive_timeout;
    private String status_autorefresh;
    private int shared_users;
    private boolean add_mac_cookie;
    private String mac_cookie_timeout;
    private String rate_limit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdle_timeout() {
        return idle_timeout;
    }

    public void setIdle_timeout(String idle_timeout) {
        this.idle_timeout = idle_timeout;
    }

    public String getKeepalive_timeout() {
        return keepalive_timeout;
    }

    public void setKeepalive_timeout(String keepalive_timeout) {
        this.keepalive_timeout = keepalive_timeout;
    }

    public String getStatus_autorefresh() {
        return status_autorefresh;
    }

    public void setStatus_autorefresh(String status_autorefresh) {
        //Vamos a validar autorefresh
        String[] autorefresh=status_autorefresh.split("\\:");
        String hora=autorefresh[0];
        String minutos=autorefresh[1];
        String segundos=autorefresh[2];
        
        if(Integer.parseInt(hora)+Integer.parseInt(minutos)+Integer.parseInt(segundos) == 0){
            status_autorefresh = "00:00:01";
        }
        this.status_autorefresh = status_autorefresh;
    }

    public int getShared_users() {
        return shared_users;
    }

    public void setShared_users(int shared_users) {
        this.shared_users = shared_users;
    }

    public boolean isAdd_mac_cookie() {
        return add_mac_cookie;
    }

    public void setAdd_mac_cookie(boolean add_mac_cookie) {
        this.add_mac_cookie = add_mac_cookie;
    }

    public String getMac_cookie_timeout() {
        return mac_cookie_timeout;
    }

    public void setMac_cookie_timeout(String mac_cookie_timeout) {
        this.mac_cookie_timeout = mac_cookie_timeout;
    }

    public String getRate_limit() {
        return rate_limit;
    }

    public void setRate_limit(String rate_limit) {
        this.rate_limit = rate_limit;
    }
    
    
    
}
