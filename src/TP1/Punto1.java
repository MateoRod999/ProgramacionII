package TP1;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        int Nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota: ");
        Nota = sc.nextInt();
        if (Nota >= 0 && Nota < 4){
            System.out.println("Desaprobaste la materia");
        } else if (Nota==10) {
            System.out.println("Usted obtuvo un Sobresaliente, Felicitaciones!");

        }
        else if (Nota > 10 || Nota < 0) {
            System.out.println("El número que ingreso no es correcto, saliendo del programa...");
        } else {
            System.out.println("Usted aprobó la materia, sigue así.");
        }
    }
}