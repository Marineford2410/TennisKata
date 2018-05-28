/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.ico.implementacion;

/**
 *
 * @author makin
 */
public class Jugador {
    
    private String nombre;
    private String deuce;
    private int puntos;
    private boolean gano = false;

    public Jugador(String nombre) {
        this.nombre = nombre;
        puntos = 0;
        deuce = "";
    }
    
    public String getDeuce() {
        return deuce;
    }

    public void setDeuce(String deuce) {
        this.deuce = deuce;
    }

    public boolean getGano() {
        return gano;
    }

    public void setGano(boolean gano) {
        this.gano = gano;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
}
