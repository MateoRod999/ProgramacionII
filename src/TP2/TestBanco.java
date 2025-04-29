package TP2;

import java.util.Scanner;

public class TestBanco {
    public static void main(String[] args) {
        Banco miCuenta = new Banco (1000,"Roberto",99923);
        int opcion;
        Scanner decision = new Scanner(System.in);
        Banco.cuenta(miCuenta.getNombre(), miCuenta.getConfirmacionNom(), miCuenta.getNumCuenta(), miCuenta.getConfnumCuenta());
        do {
            System.out.println("\nElija una opción\n");
            System.out.println("1.Depositar saldo");
            System.out.println("2.Ver saldo");
            System.out.println("3.Retirar saldo");
            System.out.println("4.Salir...\n");
            opcion = decision.nextInt();
            switch (opcion){
                case 1:
                    Banco.depositar(miCuenta.getSaldo());
                    break;
                case 2:
                    Banco.consultarSaldo(miCuenta.getSaldo());
                break;
                case 3:
                    Banco.Retirar(miCuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingreso un valor incorrecto...");
                    break;
            }
        }
        while (opcion!=4);


    }
}