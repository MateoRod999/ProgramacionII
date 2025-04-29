package TP1;

import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la coordenada X (distinta de 0): ");
        x = sc.nextInt();
        System.out.println("Ingrese la coordenada Y (distinta de 0): ");
        y = sc.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("Las coordenadas no pueden ser cero. Saliendo del programa...");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("El punto que usted ingresó se encuentra en el primer cuadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("El punto que usted ingresó se encuentra en el segundo cuadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("El punto que usted ingresó se encuentra en el tercer cuadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("El punto que usted ingresó se encuentra en el cuarto cuadrante.");
            }
        };
    }
}
