/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class ConexionSQLSERVER {
  
    public static Connection ConectaBDD() throws SQLException {
        Connection con = null;  
        try {
        	/*
        	 * 192.168.150.53\MSSQLSERVER2008
        	 * 
        	 * 
        	 * */
            String connectionUrl = "jdbc:sqlserver://192.168.150.53\\MSSQLSERVER2008;databaseName=avdata";                    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            SQLServerDriver.class.getClass();
            
            con = DriverManager.getConnection(connectionUrl, "usr_avdata", "psw_avdata");            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSQLSERVER.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return con;
    }
    public void close(ResultSet rs) {
        if (rs != null) {
            try {
                if (!rs.isClosed())rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionSQLSERVER.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void close(PreparedStatement ps) {
        if (ps != null) {
            try {
                if (!ps.isClosed())ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionSQLSERVER.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void close(java.sql.Connection con) {
        if (con != null) {
            try {
                if (!con.isClosed())con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionSQLSERVER.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
