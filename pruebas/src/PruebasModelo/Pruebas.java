/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasModelo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luz Keren
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada= 
                new BufferedReader (new InputStreamReader (System.in));
        
        
        System.out.print("Ingrese la cantidad del bono mensual: ");
        double cantidadBono = Double.parseDouble(entrada.readLine());
        
        System.out.println("Métricas");
        
        System.out.print("Tiempo por pieza(hr): ");
        double metricaTiempo = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas de retrabajo: ");
        double metricaRetrabajo = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas completas: ");
        double metricaCompletas = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas a desechar: ");
        double metricaDesecho = Double.parseDouble(entrada.readLine());
        
        System.out.println("Puntuaciones del operador: ");
        
        System.out.print("Tiempo por pieza: ");
        double operarioTiempo = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas de retrabajo: ");
        double operarioRetrabajo =  Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas completas: ");
        double operarioCompletas = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas a desechar: ");
        double operarioDesecho = Double.parseDouble(entrada.readLine());
        
       
        
        
        Bonos b = new Bonos();
        
        double tiempo = b.CalcularPorTiempoPieza(metricaTiempo, operarioTiempo);
        System.out.println("Porcentaje de tiempo por pieza: " + tiempo + "%");
        
        double retrabajo = b.CalcularPorPiezasRetrabajo(metricaRetrabajo, operarioRetrabajo);
        System.out.println("Porcentaje de piezas de retrabajo: " + retrabajo + "%");
       
        double completas = b.CalcularPorPiezasCompletas(metricaCompletas, operarioCompletas);
        System.out.println("Porcentaje de piezas completas: " + completas + "%");
        
        double desecho = b.CalcularPorPiezasDesechos(metricaDesecho, operarioDesecho);
        System.out.println("Porcentaje de piezas de desecho: "+ desecho + "%");
        
        double porcentaje= b.CalcularPorcentajeEmpleado(); 
        System.out.println("Porcentaje de bono de empleado: "+ porcentaje + "%"); 
        
        BonoMensual a = new BonoMensual(cantidadBono);
        
        double bono= a.BonoEmpleado(cantidadBono, porcentaje);
        System.out.print("Bono otorgado: $" + bono);
      
    } 
}
