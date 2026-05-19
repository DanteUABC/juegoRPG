package juegorpg;

public interface Armadura {
    int getDefensa();
    String getNombre();
    void proteger(Personaje portador, int dano);
}