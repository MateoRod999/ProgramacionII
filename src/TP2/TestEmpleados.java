package TP2;


import java.util.Scanner;

public class TestEmpleados {
    public static void main(String[] args) {
    Empleados empleado1 = new Empleados("Danny Rand",9830294,100000);
    Empleados empleado2 = new Empleados("Jesus Pandolfi", 9384020,9000);
    Empleados empleado3 = new Empleados("Agustin Natingo",9830224,9000);
    Empleados empleado4 = new Empleados("Rigoberto Suarez", 9384060,90000);

     Scanner pp = new Scanner(System.in);
    int opcion;
        int a;
        do{
            System.out.println("Bienvenido al programa de Empresas Rand para el control de empleados");
            System.out.println("Actualmente contamos con "+Empleados.getContadorEmpleados());
            System.out.println("Desea ingresar?");
            System.out.println("1.Si.");
            System.out.println("2.No.");
            a = pp.nextInt();
            switch (a){
                case 1:
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    return;
                case 3:
                    System.out.println("La opción ingresada no es válida. Ingrese otro número.");
                    break;
            }
        }while (a!=1);

        do{
        System.out.println("Bienvenido a Empresas Rand");
        System.out.println("Estos son nuestros empleados: ");
        System.out.println("1."+empleado1.getNombre());
        System.out.println("2."+empleado2.getNombre());
        System.out.println("3."+empleado3.getNombre());
        System.out.println("4."+empleado4.getNombre());
        System.out.println("5. Salir...");
        System.out.println("Presione el número del empleado con el que desea interactuar: ");
        opcion = pp.nextInt();
        switch (opcion){
            case 1:
                empleado1.menu();
                break;
            case 2:
                empleado2.menu();
                break;
            case 3:
                empleado3.menu();
                break;
            case 4:
                empleado4.menu();
                break;
            case 5:
                System.out.println("Saliendo del programa de manejo de empleados de Empresas Rand...");
                break;
            case 6:
                System.out.println("La opción ingresada no es válida. Ingrese otro número.");
                break;
        }
        }while(opcion!=5);





}
}
