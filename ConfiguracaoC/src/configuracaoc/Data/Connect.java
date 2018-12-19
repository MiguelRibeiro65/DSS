/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PedroRibeiro
 */
public class Connect {
    private static final String URL = "localhost";
    private static final String DB = "mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "16abril1994";
    
    public static Connection connect() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://"+URL+"/"+DB+"?user="+USERNAME+"&password="+PASSWORD+"&useSSL=false");
    }
        
    public static void close(Connection conn) {
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
        
}
