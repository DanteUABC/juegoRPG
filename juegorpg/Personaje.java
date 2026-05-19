package juegorpg;

public interface Personaje 
{
    String getNombre();
    int getNivel();
    int getVida();
    void recibirDano(int daño);
    void atacar(Personaje objetivo);
    void subirNivel();
    String getClasePersonaje();
    void mostrarInfo();
    
    void equiparArma(Arma arma);
    void equiparArmadura(Armadura armadura);
    int getDanoAtaque();
}