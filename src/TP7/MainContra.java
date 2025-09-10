package TP7;

import java.util.Scanner;

public class MainContra {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String contra;
        System.out.println("Ingrese su contraseña: ");
        contra=scanner.nextLine();
        try {
            new ValCont(contra);
        }catch (InvalidException e){
            System.out.println("Contraseña invalida: "+e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
