/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Luz Keren
 */
public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "";
    private String DATABASE = "productividadtremaq";
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost/productividadtremaq";
    private Connection con;
    
    
    public Conexion(){
        con = null;
      try{
          Class.forName(DRIVER);
          con = DriverManager.getConnection(URL, USERNAME , PASSWORD);
          if (con != null){
              System.out.println("Conexion establecida..");
          }
      }catch(ClassNotFoundException | SQLException e){
          System.err.println("Error de conexion  "+ e);
      }
    }
    
    public Connection getConexion(){
        return con;
    }
    
}


