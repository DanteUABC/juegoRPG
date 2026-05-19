package juegorpg;

public class Mago extends PersonajeBase {
    private int mana;

    public Mago(String nombre) {
        super(nombre);
        this.mana = 50 + (int)(Math.random() * 51); // 50-100
    }
    
    public void anadirDanoMagico(int bonus) { this.mana += bonus; }

    @Override public String getClasePersonaje() { return "Mago"; }
    
    @Override
    public int getDanoAtaque() {
        return armaEquipada != null ? (mana/2) + armaEquipada.getDano() : (mana/2);
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
        System.out.println("Nivel " + nivel + " | Vida: " + vida + " | Mana: " + mana);
    }
}