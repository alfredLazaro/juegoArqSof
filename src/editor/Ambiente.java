package editor;

import java.util.ArrayList;
import java.util.List;

public class Ambiente extends Entorno{
    private List<Elemento> elementos;
    public Ambiente(String nombre){
        super(nombre);
        elementos=new ArrayList<>();
    }

}
