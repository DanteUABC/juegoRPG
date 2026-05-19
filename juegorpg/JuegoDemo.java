package juegorpg;

public class JuegoDemo {
    public static void main(String[] args) {
        MenuJugador menu = new MenuJugador();
        EquipadorPersonaje equipador = new EquipadorPersonaje();

        Personaje miPersonaje = menu.iniciarCreacionPersonaje();

        FabricaEquipamiento fabricaEquipamiento = menu.iniciarSeleccionEquipamiento();

        equipador.equipar(miPersonaje, fabricaEquipamiento);

        System.out.println("\n¡COMBATE DE PRUEBA!");
        
        Personaje goblin = new FabricaGuerrero().crearPersonaje("Goblin");
        
        System.out.println(miPersonaje.getNombre() + " ataca a un " + goblin.getNombre() + "...");
        miPersonaje.atacar(goblin);

        if (goblin.getVida() <= 0) {
            System.out.println(goblin.getNombre() + " ha sido derrotado.");
        } else {
            System.out.println(goblin.getNombre() + " sobrevive con " + goblin.getVida() + " de vida.");
        }
    }
}
