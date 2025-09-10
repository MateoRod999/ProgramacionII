package TP7;

import java.util.Scanner;

public class MainCine {
    public static void main(String[] args) {
        Cine cine = new Cine(15);
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n----- Bienvenido a Cine Sunstar -----");
            System.out.println("1. Reservar asientos");
            System.out.println("2. Ver asientos disponibles");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("¿Cuántos asientos desea reservar? ");
                        int asientosAreservar = scanner.nextInt();
                        scanner.nextLine();

                        if (asientosAreservar > (cine.cantAs - cine.cantOcup)) {
                            System.out.println("⚠ No hay tantos asientos disponibles.");
                            break;
                        }

                        for (int i = 1; i <= asientosAreservar; i++) {
                            System.out.print("Ingrese el asiento que desea reservar (Ej: 01, 02...): ");
                            String comprado = scanner.nextLine();
                            cine.comprarAsiento(comprado);
                        }
                        break;

                    case 2:
                        cine.mostrarDisponibles();
                        break;

                    case 3:
                        System.out.println("Gracias por usar Cine Sunstar. ¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("⚠ Opción no válida, intente de nuevo.");
                }
            } catch (AsientoException | NoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

