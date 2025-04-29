package TP2;

import java.util.Scanner;

public class TestLibería {
    public static void main(String[] args) {
        Librería libro1 = new Librería("La historia de Tung Tung Tung Sahur", "Matias Gorduero", 92952838, "Disponible");
        Librería libro2 = new Librería("La Revolución de Italian Brian Rot", "El Filipinas", 938920384,"Disponible");
        Librería libro3 = new Librería("La historia del Medinazo","Felipe ¨C7¨ Sanchez Tello", 895274309, "Disponible");
        int opcion;
        Scanner op = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a la librería ¨El Gordo¨");
            System.out.println("Que libro desea?");
            System.out.println("1. La historia de Tung Tung Tung Sahur");
            System.out.println("2. La Revolución de Italian Brian Rot");
            System.out.println("3. La historia del Medinazo");
            System.out.println("4. Salir de la librería...");
            opcion = op.nextInt();
                switch (opcion) {
                    case 1:
                        libro1.menu();
                        break;
                    case 2:
                        libro2.menu();
                        break;
                    case 3:
                        libro3.menu();
                        break;
                    case 4:
                        System.out.println("Saliendo de la librería...");
                        break;
                    default:
                        System.out.println("Ingreso un valor incorrecto. Vuelva a intentarlo...");

                }
        }while (opcion!=3);
    }
}