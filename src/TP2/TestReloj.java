package TP2;

import java.util.Scanner;

public class TestReloj {
    public static void main(String[] args) {
        int opcion;
        Reloj reloj = new Reloj();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la hora (debe ser entre 0 y 23): ");
        int horas = sc.nextInt();
        System.out.println("\nIngrese los minutos (debe ser entre 0 y 59): ");
        int minutos = sc.nextInt();
        System.out.println("\nIngrese los segundos (debe ser entre 0 y 59): ");
        int segundos = sc.nextInt();
        reloj.establecerHora(horas, minutos, segundos);
        reloj.mostrarHora();
        do{
            System.out.println("\n\nElija una opción:\n");
            System.out.println("1. Mostrar hora actual.");
            System.out.println("2. Avanzar un segundo.");
            System.out.println("3. Salir...");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    reloj.mostrarHora();
                    break;
                case 2:
                    reloj.avanzarSegundo();
                    break;
                default:
                    System.out.println("\nSaliendo del programa...");
                    break;

            }
        }while (opcion!=3);
    }
    }
