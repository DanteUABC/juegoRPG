package juegorpg;

public class Arquero extends PersonajeBase {
    private int punteria;

    public Arquero(String nombre) {
        super(nombre);
        this.punteria = 70 + (int)(Math.random() * 21); // 70-90
    }
    
    public void anadirPunteria(int bonus) { this.punteria += bonus; }

    @Override public String getClasePersonaje() { return "Arquero"; }

    @Override
    public int getDanoAtaque() {
        return armaEquipada != null ? (punteria/3) + armaEquipada.getDano() : (punteria/3);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int danoTotal = getDanoAtaque();
        if(armaEquipada != null) armaEquipada.usar(this, objetivo);
        objetivo.recibirDano(danoTotal);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " el " + getClasePersonaje());
        System.out.println("Nivel " + nivel + " | Vida: " + vida + " | Puntería: " + punteria);
    }
}