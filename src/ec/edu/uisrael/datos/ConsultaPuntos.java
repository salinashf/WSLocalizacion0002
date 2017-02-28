package ec.edu.uisrael.datos;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2010
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConsultaPuntos extends ConexionSQLSERVER {
    public List<Punto> ConsultaPuntosCercanos(Punto puntoSup, Punto puntoInf) throws SQLException, Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        String sql;
        List<Punto> puntos = new ArrayList<>();
        try {
            conn = ConectaBDD();
            sql = "Select SystemID,SiteName,Latitude,Longitude from SourceSite"
            		+ " where "
                    + "     convert(float , replace(Latitude,',','.') )  >="+puntoSup.getLatitude()
                    + " and convert(float , replace(Latitude,',','.') ) <="+puntoInf.getLatitude()
                    + " and convert(float , replace(Longitude,',','.') ) >="+puntoSup.getLongitude()
                    + " and convert(float , replace(Longitude,',','.') ) <="+puntoInf.getLongitude() 
            		+ " " ;
                    
            System.out.println(sql);        
            pstmt = conn.prepareStatement(sql);
            resultSet = pstmt.executeQuery();
            //ResultSetMetaData rsMd = resultSet.getMetaData();
            while (resultSet.next()) {
                puntos.add(
                        new Punto(
                                resultSet.getString("SystemID").trim(),
                                resultSet.getString("SiteName").trim(),
                                resultSet.getString("Latitude").trim(),
                                resultSet.getString("Longitude").trim()
                        ));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPuntos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(resultSet);
            close(pstmt);
            close(conn);
        }
        return puntos;
    }

}
