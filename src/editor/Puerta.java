package editor;

public class Puerta extends Elemento{
    //private String nombre;

    private Ambiente destino;
    public Puerta(String nombre,Ambiente destino){
        super(nombre);
        this.destino=destino;
    }
    public void interactuar(Personaje personaje){
        
    }
}