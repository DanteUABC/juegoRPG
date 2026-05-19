package juegorpg;

public class ArmaduraDemoniaca implements Armadura {
    @Override public int getDefensa() { return 40; }
    @Override public String getNombre() { return "Armadura de escamas de dragón"; }
    @Override public void proteger(Personaje portador, int dano) {}
}