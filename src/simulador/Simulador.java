package simulador;

import juego.editor.Ambiente;
import editor.Entorno;
import editor.Personaje;

public class Simulador {
    private Entorno entornAct; //tiene entorno actual
    private Personaje jugador;
    public Simulador(Entorno entornoAct) {
        jugador= new Personaje("jugador1",(Ambiente) entornoAct);
    }

    public void run()  {
        System.out.println("Corriendo el simulador");
    }
}
