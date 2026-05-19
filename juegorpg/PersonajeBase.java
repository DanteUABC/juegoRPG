package juegorpg;

public abstract class PersonajeBase implements Personaje {
    protected String nombre;
    protected int nivel;
    protected int vida;
    protected Arma armaEquipada;
    protected Armadura armaduraEquipada;

    public PersonajeBase(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.vida = 100;
    }

    @Override public String getNombre() { return nombre; }
    @Override public int getNivel() { return nivel; }
    @Override public int getVida() { return vida; }
    @Override public void subirNivel() { this.nivel++; }
    
    @Override
    public void equiparArma(Arma arma) {
        this.armaEquipada = arma;
    }

    @Override
    public void equiparArmadura(Armadura armadura) {
        this.armaduraEquipada = armadura;
    }

    @Override
    public void recibirDano(int dano) {
        int danoFinal = dano;
        if (armaduraEquipada != null) {
            System.out.println(armaduraEquipada.getNombre() + " absorbe parte del daño.");
            danoFinal -= armaduraEquipada.getDefensa();
            if (danoFinal < 0) danoFinal = 0;
        }
        this.vida -= danoFinal;
        if (this.vida < 0) this.vida = 0;
    }
}