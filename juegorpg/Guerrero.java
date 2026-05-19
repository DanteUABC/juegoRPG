package juegorpg;

public class Guerrero extends PersonajeBase 
{
    private int fuerza;

    public Guerrero(String nombre) {
        super(nombre);
        // Fuerza aleatoria entre 15 y 20
        this.fuerza = 15 + (int)(Math.random() * 6);
    }

    public void anadirFuerza(int bonus) { this.fuerza += bonus; }
    public int getFuerza() { return fuerza; }

    @Override
    public String getClasePersonaje() { return "Guerrero"; }

    @Override
    public int getDanoAtaque() {
        int danoBase = fuerza;
        return armaEquipada != null ? danoBase + armaEquipada.getDano() : danoBase;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int danoTotal = getDanoAtaque();
        if(armaEquipada != null) {
            armaEquipada.usar(this, objetivo);
        }
        System.out.println("¡Golpe crítico! " + objetivo.getNombre() + " recibe " + danoTotal + " de daño.");
        objetivo.recibirDano(danoTotal);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " el " + getClasePersonaje());
        System.out.println("Nivel " + nivel + " | Vida: " + vida + " | Fuerza: " + fuerza);
    }
}