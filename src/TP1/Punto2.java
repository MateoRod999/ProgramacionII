package TP1;

import java.util.Scanner;

import static java.lang.System.*;

public class Punto2 {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        Scanner si = new Scanner(in);

        out.println("Ingrese la nota de su primer parcial: ");
        nota1 = si.nextInt();
        if (nota1 >= 0 && nota1 <= 10) {
            out.println("Ingrese la nota de su segundo parcial: ");
            nota2 = si.nextInt();
            if (nota2 >= 0 && nota2 <= 10) {
                out.println("Ingrese la nota de su tercer parcial: ");
                nota3 = si.nextInt();
                if (nota3 >= 0 && nota3 <= 10) {
                    int suma = nota1 + nota2 + nota3;
                    float promedio = suma / 3.0f;
                    if (promedio >= 8) {
                        System.out.println("Felicitaciones, promocionaste!\nTu promedio es:"+promedio);
                    } else {
                        System.out.println("Lo siento, pero tu promedio no es suficiente para promocionar\nTu promedio es de:"+promedio);
                    }
                }
                else {
                    out.println("El número que ingreso no es correcto, saliendo del programa...");
                }
            }
            else {
                out.println("El número que ingreso no es correcto, saliendo del programa...");
            }
        }
        else {
            out.println("El número que ingreso no es correcto, saliendo del programa...");
        }
    }
}