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
public class BonoMensual {
    
   double cantidadBono;
   double bonoEmpleado;
   double porcentajeEmpleado;
    
    public BonoMensual(double cantidadBono){
        this.setCantidadBono(cantidadBono);
    }
    public double getCantidadBono(){
        return cantidadBono;
    }
    public void setCantidadBono(double cantidadBono){
        this.cantidadBono = cantidadBono;
    }
    //Calcular el bono que le corresponde al empleado
    
    public double BonoEmpleado(double cantidadBono, double porcentajeEmpleado){
        bonoEmpleado = (cantidadBono*porcentajeEmpleado);
        return bonoEmpleado;
    }
   
}
