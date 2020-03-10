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
public class Empleado {
    int numeroEmpleado;
    String nombreEmpleado;
    String departamento;
    
    public Empleado (int numeroEmpleado, String nombreEmpleado, String departamento){
        this.setNumeroEmpleado(numeroEmpleado);
        this.setNombreEmpleado(nombreEmpleado);
        this.setDepartamento(departamento);
        
    }
    public int getNumeroEmpleado(){
        return numeroEmpleado;
    }
    public void setNumeroEmpleado(int numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getNombreEmpleado(){
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado){
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
