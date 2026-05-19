package juegorpg;

public class ArmaDemoniaca implements Arma {
    @Override public int getDano() { return 50; }
    @Override public String getNombre() { return "Espada de fuego infernal"; }
    @Override public void usar(Personaje portador, Personaje objetivo) {}
}