package juegorpg;

public class ArmaduraElfica implements Armadura {
    @Override public int getDefensa() { return 20; }
    @Override public String getNombre() { return "Túnica de hojas de árbol"; }
    @Override public void proteger(Personaje portador, int dano) {}
}