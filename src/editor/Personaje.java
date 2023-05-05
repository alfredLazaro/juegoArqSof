package editor;

public class Personaje{
    private String nombrePers;
    private Ambiente ambAct;
    public Personaje(String nombre,Ambiente ambAct){
        //ambAct=new Ambiente();
        nombrePers=nombre;
        this.ambAct=ambAct;
    }
    public void cambiarAmbiente(Ambiente nuevAmb){
        ambAct=nuevAmb;
    }
}