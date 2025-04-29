package TP1;

import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        int dia,mes,anio;
        Scanner si = new Scanner(System.in);
        System.out.println("Ingrese un número de un día: ");
        dia = si.nextInt();
        System.out.println("Ingrese un número de mes: ");
        mes = si.nextInt();
        System.out.println("Ingrese un año: ");
        anio = si.nextInt();
        if (dia > 0 && dia <32){
        if (mes >= 1 && mes <= 3) {
            System.out.println("La fecha ingresada corresponde al primer trimestre");
        }
        else if (mes >= 4 && mes <= 6) {
            System.out.println("La fecha ingresada corresponde al segundo trimestre");
        }
        else if (mes >= 7 && mes <= 9) {
            System.out.println("La fecha ingresada corresponde al tercer trimestre");
        }
        else if (mes >= 8 && mes <= 12) {
            System.out.println("La fecha ingresada corresponde al cuarto trimestre");
        }
        else {
            System.out.println("Alguno de los valores que ingresó no es correcto, saliendo del programa...");
        }
        }
        else{
            System.out.println("Alguno de los valores que ingresó no es correcto, saliendo del programa...");
        }
    }
}