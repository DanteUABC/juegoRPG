package juegorpg;

public interface FabricaEquipamiento {
    Arma crearArma();
    Armadura crearArmadura();
    String getTematica();
    String getBonusDescripcion();
    void aplicarBonusStats(Personaje personaje);
}