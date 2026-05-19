package juegorpg;

public class EquipadorPersonaje {
    public void equipar(Personaje personaje, FabricaEquipamiento fabrica) {
        Arma arma = fabrica.crearArma();
        Armadura armadura = fabrica.crearArmadura();

        personaje.equiparArma(arma);
        personaje.equiparArmadura(armadura);
        fabrica.aplicarBonusStats(personaje); // Aplica el bonus estadístico según la temática

        System.out.println("\nEQUIPAMIENTO OBTENIDO");
        System.out.println("Arma: " + arma.getNombre() + " (Daño: " + arma.getDano() + ")");
        System.out.println("Armadura: " + armadura.getNombre() + " (Defensa: " + armadura.getDefensa() + ")");
        System.out.println("\n" + personaje.getNombre() + " EQUIPADO");
        
        // Imprimir stats finales adaptados según la clase
        if (personaje instanceof Guerrero) {
            System.out.println("Vida: " + personaje.getVida() + " | Fuerza total: " + ((Guerrero)personaje).getFuerza());
        }
        System.out.println("Daño de ataque total: " + personaje.getDanoAtaque());
    }
}