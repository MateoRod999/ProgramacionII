package TP2;

import java.util.Scanner;

public class Empleados {
    private String nombre;
    private int legajo;
    private double salario;
    private int emptot;
    private double aumento, aumentoPorcentaje;
    private static int contadorEmpleados = 0;
    Scanner sc = new Scanner(System.in);

    public Empleados(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salario = salario;
        contadorEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEmptot() {
        return emptot;
    }

    public void setEmptot(int emptot) {
        this.emptot = emptot;
    }
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }


    public void manejoSalario() {
        int op;
        System.out.println("Desea aumentar el salario del empleado " + nombre + " con legajo: " + legajo + "?");
        System.out.println("1.Si.");
        System.out.println("2.No.");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Cual es el % del aumento que desea para " + nombre + " con legajo: " + legajo + "?");
                aumentoPorcentaje = sc.nextDouble();
                aumento = salario * (aumentoPorcentaje / 100);
                salario += aumento;
                System.out.printf("El nuevo salario de %s con legajo %d es: %.2f\n", nombre, legajo, salario);
                break;
            case 2:
                System.out.println("No se realizará ningún aumento.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;

        }
    }

    public void infoEmpleado() {
        System.out.println("Es el empleado: " + nombre + "\nLegajo: " + legajo + "\nSu salario:$ " + salario);
    }

    public void menu() {
        int dec;
        do {
            System.out.println("Que desea hacer con el empleado: " + nombre+"?");
            System.out.println("1.Mostrar información");
            System.out.println("2.Aumentar su salario");
            System.out.println("3.Salir...");
            dec = sc.nextInt();
            switch (dec){
                case 1:
                    infoEmpleado();
                    break;
                case 2:
                    manejoSalario();
                    break;
                case 3:
                    System.out.println("Redirigiendo al menú de empleados...");
                    break;
                case 4:
                    System.out.println("La opción ingresada no es válida. Ingrese otro número.");
                    break;
            }

        }while (dec!=3);

    }
}