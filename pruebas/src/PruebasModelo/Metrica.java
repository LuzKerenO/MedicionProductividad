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
public class Metrica {
    private String mes;
    private int anio;
    private double tiempoPieza;
    private double piezasRetrabajo;
    private double piezasCompletas;
    private double piezasDesecho;
    
    public Metrica(String mes, int anio, double tiempoPieza, double piezasRetrabajo, 
            double piezasCompletas, double piezasDesecho){
        this.setMes(mes);
        this.setAnio(anio);
        this.setTiempoPieza(tiempoPieza);
        this.setPiezasRetrabajo(piezasRetrabajo);
        this.setPiezasCompletas(piezasCompletas);
        this.setPiezasDesecho(piezasDesecho);
    }
    
    
    public String getMes(){
        return mes;
    }
    public void setMes(String mes){
        this.mes = mes;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public double getTiempoPieza(){
        return tiempoPieza;
    }
    public void setTiempoPieza(double tiempoPieza){
        this.tiempoPieza = tiempoPieza;
    }
    public double getPiezasRetrabajo(){
        return piezasRetrabajo;
    }
    public void setPiezasRetrabajo(double piezasRetrabajo){
        this.piezasRetrabajo = piezasRetrabajo;
    }
    public double getPiezasCompletas(){
        return piezasCompletas;
    }
    public void setPiezasCompletas(double piezasCompletas){
        this.piezasCompletas = piezasCompletas;
    }
    public double getPiezasDesecho(){
        return piezasDesecho;
    }
    public void setPiezasDesecho(double piezasDesecho){
    this.piezasDesecho = piezasDesecho;
    }
    
}
