/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasModelo;

/**
 *
 * @author Luz Keren
 */
public class Usuario {
    private String usuario;
    private String contrasena;
    private String nombre;
    private String area;
    public Usuario(String usuario, String contrasena, String nombre, String area){
        this.setUsuario(usuario);
        this.setContrasena(contrasena);
        this.setNombre(nombre);
        this.setArea(area);
    }
        
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area = area;
    }
}
