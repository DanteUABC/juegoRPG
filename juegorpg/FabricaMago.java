package juegorpg;

public class FabricaMago implements FabricaPersonajes {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre);
    }
}