package TP6;

import java.util.Scanner;

public class MainProyecto {
    public static void main(String[] args) {
        DiseniadorProyecto diseniador = new DiseniadorProyecto("Juan Perez");
        DesarrolladorProyecto desarrollador = new DesarrolladorProyecto("Roberto Flores");
        TesterProyecto tester = new TesterProyecto("Rodolfo Paez");
        Scanner scanner = new Scanner(System.in);

        int opcion=0;
        while (opcion!=5){
            System.out.println("Bienvenido al sitio de empleados de Empresas Rand\nIngrese una opción:\n1. Sitio para Diseñadores.\n2. Sitio para Desarrolladores.\n3. Sitio para Testers.\n4. Ver el informe de actividades.\n5. Salir.");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    diseniador.menu();
                    break;
                case 2:
                    desarrollador.menu();
                    break;
                case 3:
                    tester.menu();
                    break;
                case 4:
                    System.out.println("Este es el informe actual de actividades");
                    if(diseniador.inicioHistorial==0){
                        System.out.println("El diseñador no realizó ninguna tarea aún.");
                    }
                    else {
                        System.out.println(diseniador.obtenerHistorial());
                    }
                    if(desarrollador.inicioHistorial==0){
                        System.out.println("El desarrollador no realizó ninguna tarea aún.");
                    }
                    else{
                        System.out.println(desarrollador.obtenerHistorial());
                    }
                    if(tester.inicioHistorial==0){
                        System.out.println("El tester no realizó ninguna tarea aún.");
                    }
                    else {
                        System.out.println(tester.obtenerHistorial());
                    }
                    System.out.println("Volviendo al menú...");
                    break;
                case 5:
                    System.out.println("Saliendo de Empresas Rand...");
                    break;
                default:
                    System.out.println("Ha ingresado una opción incorrecta.");
            }
        }

    }
}
