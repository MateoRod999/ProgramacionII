package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nota;

        System.out.println("Ingrese su nota: ");

        try {
            nota=scanner.nextInt();
            new Calif(nota);
        }
        catch (NotaException e){
            System.out.println("Nota Invalida: "+e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("ERROR!. Debe ingresar un valor numerico.");
        }
        finally {
            scanner.close();
        }
    }
}
