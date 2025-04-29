package TP2;

import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner calculo = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el primer número que desee calcular: ");
        double a = calculo.nextDouble();
        System.out.println("Ingrese el segundo número que desea calcular: ");
        double b = calculo.nextDouble();
        do {
            System.out.println("\n\nSeleccione la operación: \n");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Ingresar nuevos valores");
            System.out.println("6. Salir...\n");
            opcion = calculo.nextInt();

            switch (opcion) {
                case 1:
                    double resultadoSuma = calculadora.sumar(a, b);
                    System.out.println("Resultado de la suma: " + resultadoSuma);
                    break;
                case 2:
                    double resultadoResta = calculadora.restar(a, b);
                    System.out.println("Resultado de la resta: " + resultadoResta);
                    break;
                case 3:
                    double resultadoMultiplicacion = calculadora.multiplicar(a, b);
                    System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
                    break;
                case 4:
                    double resultadoDiv = calculadora.dividir(a,b);
                    System.out.println("Resultado de la división: " + resultadoDiv);
                    break;
                case 5:
                    System.out.println("Ingrese el primer número que desee calcular: ");
                    a = calculo.nextDouble();
                    System.out.println("Ingrese el segundo número que desea calcular: ");
                    b = calculo.nextDouble();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        calculo.close();
    }
}

