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
public class Juego {

    private Jugador servidor;
    private Jugador receptor;
    

    public Juego() {
        servidor = new Jugador("Jesus");
        receptor = new Jugador("Aaron");
    }
    
    public Jugador getServidor() {
        return servidor;
    }

    public Jugador getReceptor() {
        return receptor;
    }
    
    public void ronda(int puntoPara){
        if (puntoPara == 0) {
                sumarPunto(servidor);
        }
        else if (puntoPara == 1) {
                sumarPunto(receptor);
        }
    }

    private void sumarPunto(Jugador jugador) {
        if (jugador.getPuntos() >= 0 && jugador.getPuntos() < 30) {
            jugador.setPuntos(jugador.getPuntos() + 15);
        }else if (jugador.getPuntos() >= 30 && jugador.getPuntos() < 50 ) {
            jugador.setPuntos(jugador.getPuntos() + 10);
            if (jugador.getPuntos() == 50) {
                jugador.setGano(true);
            }
        }
    }
    
    public boolean hayDeuce(){
        if(receptor.getPuntos() == 40 && servidor.getPuntos() == 40){
            return true;
        }
        else{
            return false;
        }
    } 
    
    public void deuce(Jugador ganador, Jugador perdedor){
        if (ganador.getDeuce().equals("A")) {
            ganador.setGano(true);
        }
        else{
            ganador.setDeuce("A");
            perdedor.setDeuce("");
        }
    }
    
}
