package Listas;
import Classes.Nodo;

public class ListaNodos {
    public Nodo minodo;
    public ListaNodos link;
    public ListaNodos linkIncidentes;
    public ListaNodos linkMePuedenInfectar;
    
    public ListaNodos(Nodo minodo) {
        this.minodo = minodo;
        this.link = null;
        this.linkIncidentes = null;
    }
    
}
