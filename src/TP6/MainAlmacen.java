package TP6;

import java.util.Scanner;

public class MainAlmacen {

    public static void main(String[] args) {
        Ropa ropa = new Ropa();
        Alimentos alimento = new Alimentos();
        Electronicos electronico = new Electronicos();
        Scanner scanner= new Scanner(System.in);

        int opcion=0;
        while (opcion!=5){
            System.out.println("Bienvenido al Almacen del negocio.\nIngrese una opcion:\n1. Seccion ropa.\n2. Seccion alimentos.\n3. Seccion electronicos.\n4. Ver stock total del almacen.\n5. Salir.");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    ropa.menu();
                    break;
                case 2:
                    alimento.menu();
                    break;
                case 3:
                    electronico.menu();
                    break;
                case 4:
                    System.out.println("Este es el stock total del negocio");
                    if(ropa.estado==0){
                        System.out.println("Stock de Ropa:");
                        System.out.println("No ha agregado ningun producto aun.");
                    }
                    else {
                        System.out.println("Stock de Ropa:");
                        System.out.println(ropa.stock());
                    }
                    if(alimento.estado==0){
                        System.out.println("Stock de Alimentos:\t\t\t\t\tFecha de hoy es: "+alimento.fechaDeHoy);
                        System.out.println("No ha agregado ningun producto aun.");
                    }
                    else{
                        System.out.println("Stock de Alimentos:\t\t\t\t\tFecha de hoy es: "+alimento.fechaDeHoy);
                        System.out.println(alimento.stock());
                    }
                    if(electronico.estado==0){
                        System.out.println("Stock de Electronicos:");
                        System.out.println("No ha agregado ningun producto aun.");
                    }
                    else {
                        System.out.println("Stock de Electronicos:");
                        System.out.println(electronico.stock());
                    }
                    System.out.println("Volviendo al menú...");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta, vuelva a intentarlo.");
            }
        }

    }

}
