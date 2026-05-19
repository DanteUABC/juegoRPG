package juegorpg;

public class ArmaduraVikingo implements Armadura {
    @Override public int getDefensa() { return 30; }
    @Override public String getNombre() { return "Armadura de cuero y metal"; }
    @Override public void proteger(Personaje portador, int dano) {}
}