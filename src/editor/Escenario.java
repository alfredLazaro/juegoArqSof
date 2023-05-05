package editor;
import java.util.*;
public class Escenario extends Entorno{
    private List<Entorno> entornos;
    public Escenario(String nombEsc){
        super(nombEsc);
        entornos = new ArrayList<Entorno>();
    }
    public void agregarEntorno(Entorno entorAct){
        entornos.add(entorAct);
    }

}