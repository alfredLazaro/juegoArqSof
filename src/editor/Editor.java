package editor;
import java.util.*;
public class Editor {
    private List<Entorno> entornos;
    private Entorno actual;
    public Editor(){
         actual=new Escenario("edificio");
         entornos=new ArrayList<>();
    }
    Ambiente ambiente1= new Ambiente("aula 625C");
    Ambiente aula625D= new Ambiente("aula 625D");
    Ambiente labo1 = new Ambiente("labo1");
    Ambiente labo2 = new Ambiente("labo2");
    Puerta  puera625C= new Puerta("aula 625C",ambiente1);
    Puerta puerta625D= new Puerta("aula 625D",aula625D);
    Puerta puerLabo = new Puerta("puertLabo1",labo1);
    Puerta puerLab2 = new Puerta("puerLab2",labo2);

    //actual.agregarEntorno(ambiente1);
    //actual.
    public Entorno getEntorno() {
        return getEscenarioDePrueba();
    }

    public Entorno getEscenarioDePrueba() {
        return null;
    }
}
