/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasModelo;

import java.io.IOException;
import java.sql.Connection;

/**
 *
 * @author Luz Keren
 */
public class ProbarConexion {
    public static void main(String[] args) throws IOException {
    Conexion con = new Conexion();
    Connection c = con.getConexion();
    
    }
}
