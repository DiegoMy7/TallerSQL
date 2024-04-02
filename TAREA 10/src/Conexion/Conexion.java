
package Conexion;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Conexion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String passwd = "";
        try {
            Connection conexion = DriverManager.getConnection(url, user, passwd);

            if (conexion != null) {
                System.out.println("Conectado");

                conexion.close(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
        
    
    

