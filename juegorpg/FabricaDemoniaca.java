package juegorpg;

public class FabricaDemoniaca implements FabricaEquipamiento {
    @Override public Arma crearArma() { return new ArmaDemoniaca(); }
    @Override public Armadura crearArmadura() { return new ArmaduraDemoniaca(); }
    @Override public String getTematica() { return "Demoníaco"; }
    @Override public String getBonusDescripcion() { return "+25 Daño mágico"; }

    @Override
    public void aplicarBonusStats(Personaje personaje) {
        if(personaje instanceof Mago) {
            ((Mago) personaje).anadirDanoMagico(25);
        }
    }
}