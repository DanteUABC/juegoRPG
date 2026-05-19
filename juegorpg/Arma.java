package juegorpg;

public interface Arma {
    int getDano();
    String getNombre();
    void usar(Personaje portador, Personaje objetivo);
}