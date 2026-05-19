package juegorpg;

public class FabricaElfica implements FabricaEquipamiento {
    @Override public Arma crearArma() { return new ArmaElfica(); }
    @Override public Armadura crearArmadura() { return new ArmaduraElfica(); }
    @Override public String getTematica() { return "Élfico"; }
    @Override public String getBonusDescripcion() { return "+20 Puntería"; }
    
    @Override
    public void aplicarBonusStats(Personaje personaje) {
        if(personaje instanceof Arquero) {
            ((Arquero) personaje).anadirPunteria(20);
        }
    }
}