package TP1;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        int n, lado1, lado2, lado3;
        int equilatero = 0, isosceles = 0, escaleno = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos triángulos desea analizar?");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTriángulo " + i + ":");
            System.out.println("Ingrese el primer lado:");
            lado1 = sc.nextInt();
            System.out.println("Ingrese el segundo lado:");
            lado2 = sc.nextInt();
            System.out.println("Ingrese el tercer lado:");
            lado3 = sc.nextInt();

            if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
                System.out.println("Los lados deben ser mayores a cero. Triángulo inválido.");
                continue;
            }

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
                equilatero++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
                isosceles++;
            } else {
                System.out.println("El triángulo es escaleno.");
                escaleno++;
            }
        }

        System.out.println("\nResumen:");
        System.out.println("Cantidad de triángulos equiláteros: " + equilatero);
        System.out.println("Cantidad de triángulos isósceles: " + isosceles);
        System.out.println("Cantidad de triángulos escalenos: " + escaleno);

        if (equilatero < isosceles && equilatero < escaleno) {
            System.out.println("El tipo de triángulo con menor cantidad es: Equilátero");
        } else if (isosceles < equilatero && isosceles < escaleno) {
            System.out.println("El tipo de triángulo con menor cantidad es: Isósceles");
        } else if (escaleno < equilatero && escaleno < isosceles) {
            System.out.println("El tipo de triángulo con menor cantidad es: Escaleno");
        } else {
            System.out.println("Hay empate en la menor cantidad de tipos de triángulo.");
        }
    }
}
