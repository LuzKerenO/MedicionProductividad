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
        
        
        String usuario= "luzkeren";
        String contrasena = "tremaq";
        String nombre = "Luz Keren Ochoa";
        String area = "Administracion";
        
        Usuario u = new Usuario(usuario, contrasena, nombre, area);
        
        System.out.println("Ingrese su usuario: ");
        String usuarioA = entrada.readLine(); 
        
        System.out.println("Ingrese su contraseña");
        String contrasenaA = entrada.readLine();
        
        if (usuarioA.equals(u.getUsuario()) && contrasenaA.equals(u.getContrasena())){
        
        //Se ingresa la cantidad por consola y esta se manda como parametro de Bono mensual
        System.out.print("Ingrese la cantidad del bono mensual: ");
        double cantidadBono = Double.parseDouble(entrada.readLine());
        BonoMensual bm = new BonoMensual(cantidadBono);
         
        
        System.out.println("Métricas");
        
        System.out.print("Mes: ");
        String mes = entrada.readLine();
        
        System.out.print("Año: ");
        int anio = Integer.parseInt(entrada.readLine()); 
        
        System.out.print("Tiempo por pieza(hr): ");
        double metricaTiempo = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas de retrabajo: ");
        double metricaRetrabajo = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas completas: ");
        double metricaCompletas = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas a desechar: ");
        double metricaDesecho = Double.parseDouble(entrada.readLine());
        
        //Se asignan los valores que el usuario introdujo como parametros de la clase metrica
        //Se crea un objeto de la clase metrica
        Metrica n = new Metrica(mes, anio, metricaTiempo, metricaRetrabajo, 
                metricaCompletas, metricaDesecho);
        
        System.out.println("Ingrese el número de empleado");
        int numeroEmpleado = Integer.parseInt(entrada.readLine());
        
        System.out.println("Ingrese el nombre completo del empleado");
        String nombreEmpleado = entrada.readLine();
        
        System.out.println("Ingrese el departamento");
        String departamento = entrada.readLine();
        
        Empleado e = new Empleado(numeroEmpleado, nombreEmpleado, departamento);
        
        
        System.out.println("Puntuaciones del operador: ");
        
        System.out.print("Tiempo por pieza: ");
        double operarioTiempo = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas de retrabajo: ");
        double operarioRetrabajo =  Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas completas: ");
        double operarioCompletas = Double.parseDouble(entrada.readLine());
        
        System.out.print("Piezas a desechar: ");
        double operarioDesecho = Double.parseDouble(entrada.readLine());
        
        //Se asignan los valores que introdujo el usuario como paratemros
        //se crea un objeto de la clase PuntuacionEmpleado
        PuntuacionEmpleado p = new PuntuacionEmpleado(numeroEmpleado, operarioTiempo, 
                operarioRetrabajo, operarioCompletas, operarioDesecho);
        
        
        Bonos b = new Bonos();
        
        double tiempo = b.CalcularPorTiempoPieza(n.getTiempoPieza(), p.getTiempoPieza());
        System.out.println("Porcentaje de tiempo por pieza: " + tiempo + "%");
        
        double retrabajo = b.CalcularPorPiezasRetrabajo(n.getPiezasRetrabajo(), p.getPiezasRetrabajo());
        System.out.println("Porcentaje de piezas de retrabajo: " + retrabajo + "%");
       
        double completas = b.CalcularPorPiezasCompletas(n.getPiezasCompletas(), p.getPiezasCompletas());
        System.out.println("Porcentaje de piezas completas: " + completas + "%");
        
        double desecho = b.CalcularPorPiezasDesechos(n.getPiezasDesecho(), p.getPiezasDesecho());
        System.out.println("Porcentaje de piezas de desecho: "+ desecho + "%");
        
        double porcentaje= b.CalcularPorcentajeEmpleado(); 
        System.out.println("Porcentaje de bono de empleado: "+ porcentaje + "%"); 
        
        BonoMensual a = new BonoMensual(cantidadBono);
        
        double bono= a.BonoEmpleado(bm.getCantidadBono(), porcentaje);
        
        System.out.println("Bono otorgado: $" + bono);
      
        }else{
            System.out.println("Usuario/contraseña inválidos");
        }
    } 
}
