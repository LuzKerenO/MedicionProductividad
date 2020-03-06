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
    private float anio;
    private float tiempoPieza;
    private float piezasRetrabajo;
    private float piezasCompletas;
    private float piezasDesecho;
    
    public Metrica(String mes, float anio, float tiempoPieza, float piezasRetrabajo, 
            float piezasCompletas, float piezasDesecho){
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
    public float getAnio(){
        return anio;
    }
    public void setAnio(float anio){
        this.anio = anio;
    }
    public float getTiempoPieza(){
        return tiempoPieza;
    }
    public void setTiempoPieza(float tiempoPieza){
        this.tiempoPieza = tiempoPieza;
    }
    public float getPiezasRetrabajo(){
        return piezasRetrabajo;
    }
    public void setPiezasRetrabajo(float piezasRetrabajo){
        this.piezasRetrabajo = piezasRetrabajo;
    }
    public float getPiezasCompletas(){
        return piezasCompletas;
    }
    public void setPiezasCompletas(float piezasCompletas){
        this.piezasCompletas = piezasCompletas;
    }
    public float getPiezasDesecho(){
        return piezasDesecho;
    }
    public void setPiezasDesecho(float piezasDesecho){
    this.piezasDesecho = piezasDesecho;
    }
    
}
