package TP1;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número positivo del que desees saber si tiene uno o dos dígitos: ");
        numero = sc.nextInt();
        if (numero >= 1 && numero < 10) {
            System.out.println("Su número tiene un solo digito");
        } else if (numero >= 10 && numero < 100) {
            System.out.println("Su número tiene dos digitos");
        }
        else{
            System.out.println("Error!, Su número tiene más de dos digitos");
        }

    }
}