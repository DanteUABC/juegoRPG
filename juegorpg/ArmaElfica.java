package juegorpg;

public class ArmaElfica implements Arma {
    @Override public int getDano() { return 35; }
    @Override public String getNombre() { return "Arco largo élfico"; }
    @Override public void usar(Personaje portador, Personaje objetivo) {}
}