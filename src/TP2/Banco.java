package TP2;

import java.util.Scanner;

public class Banco {
    private double saldo;
    private String nombre;
    private String confirmacionNom;
    private int numCuenta;
    private int confnumCuenta;
    Scanner si = new Scanner(System.in);

    public Banco(int saldo, String nombre, int numCuenta) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.numCuenta = numCuenta;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConfirmacionNom() {
        return confirmacionNom;
    }

    public void setConfirmacionNom(String confirmacionNom) {
        this.confirmacionNom = confirmacionNom;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getConfnumCuenta() {
        return confnumCuenta;
    }

    public void setConfnumCuenta(int confnumCuenta) {
        this.confnumCuenta = confnumCuenta;
    }

    public static void cuenta(String getNombre, String confirmacionNom, int getNumCuenta, int confnumCuenta){
        Scanner si = new Scanner(System.in);
        boolean acceso;
        do{
            acceso = false;
            System.out.println("Ingrese el nombre de usuario: ");
            confirmacionNom = si.nextLine();
            System.out.println("Ingrese su número de cuenta: ");
            confnumCuenta= si.nextInt();
            if (getNombre.equalsIgnoreCase(confirmacionNom) && getNumCuenta==confnumCuenta) {
                System.out.println("Bienvenido a su cuenta: " +getNombre);
                acceso = true;
            }
            else {
                System.out.println("Ingreso una cuenta inexistente.\n\nRedirigiendo al login...\n\n");
            }
        }
        while (acceso!=true);

    };
    public static void depositar(double getSaldo) {
        System.out.println("Cuanto desea depositar: ");
        Scanner scanner = new Scanner(System.in);
        int deposito = scanner.nextInt();
        if (deposito < 0) {
            System.out.println("\nIngrese un numero válido...");

        } else {
            getSaldo = deposito + getSaldo;
        }
    }
    public static void Retirar(double getSaldo){
        System.out.println("Cuanto desea retirar: ");
        Scanner scanner= new Scanner(System.in);
        int retirar=scanner.nextInt();
        if(retirar<getSaldo){
            System.out.println("No puede retirar mas dinero del que posee...");
        }else{
            getSaldo=getSaldo-retirar;
            System.out.printf("Acción realizada, retiró %d, ahora posee %d en su cuenta bancaria",retirar,getSaldo);
            }
    }
    public static void consultarSaldo(double getSaldo){
        System.out.printf("Tu saldo es: %d",getSaldo);
}
}
