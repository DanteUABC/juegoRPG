package juegorpg;

public class ArmaVikingo implements Arma {
    @Override public int getDano() { return 45; }
    @Override public String getNombre() { return "Hacha de dos manos"; }
    @Override public void usar(Personaje portador, Personaje objetivo) {}
}