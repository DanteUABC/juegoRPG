package juegorpg;

public class FabricaVikingo implements FabricaEquipamiento {
    @Override public Arma crearArma() { return new ArmaVikingo(); }
    @Override public Armadura crearArmadura() { return new ArmaduraVikingo(); }
    @Override public String getTematica() { return "Vikingo"; }
    @Override public String getBonusDescripcion() { return "+15 Fuerza"; }
    
    @Override
    public void aplicarBonusStats(Personaje personaje) {
        if(personaje instanceof Guerrero) {
            ((Guerrero) personaje).anadirFuerza(15);
        }
    }
}