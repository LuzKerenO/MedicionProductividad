package PruebasModelo;

/**
 *
 * @author Luz Keren
 */
public class Bonos {
   double tiempoPieza;
   double valTiempoPieza;
   double porTiempoPieza;
   
   double piezasRetrabajo;
   double valPiezasRetrabajo;
   double porPiezasRetrabajo;
   
   double piezasCompletas;
   double valPiezasCompletas;
   double porPiezasCompletas;
   
   double piezasDesecho;
   double valPiezasDesecho;
   double porPiezasDesecho;
   
   double porcentajeEmpleado;
   
   double cantidadBono;
   double bonoEmpleado;
   
   //Tiempo por pieza
   public double CalcularPorTiempoPieza(double tiempoPieza, double valTiempoPieza){
       if (tiempoPieza>valTiempoPieza){
          porTiempoPieza= 0.25;
       } else{
           porTiempoPieza = ((tiempoPieza/valTiempoPieza)*0.25);
       }
      return porTiempoPieza;
   }
   public double getPorTiempoPieza(){
       return porTiempoPieza;
   }
   public void setPorTiempoPieza(double porTiempoPieza){
       this.porTiempoPieza = porTiempoPieza;
   }
   //Piezas de retrabajo
   public double CalcularPorPiezasRetrabajo (double piezasRetrabajo, double valPiezasRetrabajo){
       if (piezasRetrabajo>valPiezasRetrabajo){
           porPiezasRetrabajo = 0.25;
       }else {
           porPiezasRetrabajo = ((piezasRetrabajo/valPiezasRetrabajo)*0.25);  
       }
       return porPiezasRetrabajo;
   }
   public double getPorPiezasRetrabajo(){
       return porPiezasRetrabajo;
   }
   public void setPorPiezasRetrabajo(double porPiezasRetrabajo){
       this.porPiezasRetrabajo = porPiezasRetrabajo;
   }
   //Piezas completas
   public double CalcularPorPiezasCompletas(double piezasCompletas, double valPiezasCompletas){
       if (piezasCompletas<valPiezasCompletas){
           porPiezasCompletas= 0.25;
       }else{
           porPiezasCompletas = ((valPiezasCompletas/piezasCompletas)*0.25);
                   
                   }
       return porPiezasCompletas;
    }
   public double getPorPiezasCompletas(){
       return porPiezasCompletas;
   }
   public void setPorPiezasCompletas(double porPiezasCompletas){
       this.porPiezasCompletas = porPiezasCompletas;
   }
   //Piezas de desecho
   public double CalcularPorPiezasDesechos(double piezasDesecho, double valPiezasDesecho){
       if(piezasDesecho>valPiezasDesecho){
           porPiezasDesecho = 0.25;
       }else{
           porPiezasDesecho = ((piezasDesecho/valPiezasDesecho)*0.25);
       }
       return porPiezasDesecho;
   }
   public double getPorPiezasDesecho(){
       return porPiezasDesecho;
   }
   public void setPorPiezasDesecho(double porPiezasDesecho){
       this.porPiezasDesecho = porPiezasDesecho;
   }
  //Porcentaje total del trabajador
   public double CalcularPorcentajeEmpleado (){
   porcentajeEmpleado = (porTiempoPieza+porPiezasRetrabajo+porPiezasCompletas+porPiezasDesecho);
    return porcentajeEmpleado;
   }   
}