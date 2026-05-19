package juegorpg;

import java.util.Scanner;

public class MenuJugador {
    private Scanner scanner;

    public MenuJugador() {
        this.scanner = new Scanner(System.in);
    }

    public Personaje iniciarCreacionPersonaje() {
        System.out.println("=== GUILD QUEST STUDIOS: CREADOR DE PERSONAJES ===");
        System.out.println("Selecciona tu clase:");
        System.out.println("1. Guerrero (Fuerza bruta)");
        System.out.println("2. Mago (Poder arcano)");
        System.out.println("3. Arquero (Precisión letal)");
        System.out.print("Opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        FabricaPersonajes fabrica = null;
        String claseElegida = "";

        switch (opcion) {
            case 1: fabrica = new FabricaGuerrero(); claseElegida = "guerrero"; break;
            case 2: fabrica = new FabricaMago(); claseElegida = "mago"; break;
            case 3: fabrica = new FabricaArquero(); claseElegida = "arquero"; break;
            default: 
                System.out.println("Opción inválida. Seleccionando Guerrero por defecto.");
                fabrica = new FabricaGuerrero(); claseElegida = "guerrero";
        }

        System.out.print("Ingresa el nombre de tu " + claseElegida + ": ");
        String nombre = scanner.nextLine();

        Personaje personaje = fabrica.crearPersonaje(nombre);
        System.out.println("\nPersonaje CREADO");
        personaje.mostrarInfo();
        return personaje;
    }

    public FabricaEquipamiento iniciarSeleccionEquipamiento() {
        System.out.println("\nSelecciona tu estilo de equipamiento:");
        System.out.println("1. Vikingo (+15 Fuerza)");
        System.out.println("2. Élfico (+20 Puntería)");
        System.out.println("3. Demoníaco (+25 Daño mágico)");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: return new FabricaVikingo();
            case 2: return new FabricaElfica();
            case 3: return new FabricaDemoniaca();
            default:
                System.out.println("Opción inválida. Seleccionando Vikingo por defecto.");
                return new FabricaVikingo();
        }
    }
}