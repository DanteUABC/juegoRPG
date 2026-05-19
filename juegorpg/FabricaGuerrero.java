package juegorpg;

public class FabricaGuerrero implements FabricaPersonajes 
{
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}