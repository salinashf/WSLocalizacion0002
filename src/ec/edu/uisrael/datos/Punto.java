
package ec.edu.uisrael.datos;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2010
 */

public class Punto {

    public Punto(String siteid, String sitename, String latitude, String longitude) {
        this.siteid = siteid;
        this.sitename = sitename;
        this.latitude = latitude;
        this.longitude = longitude;
    }
      public Punto( String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    private String siteid;
    private String sitename;
    private String latitude;
    private String longitude;

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    
}
