package TP6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int opcion=0;
        Scanner scanner1 = new Scanner(System.in);

        SensorTemperatura sensor = new SensorTemperatura("Sensor 1");
        CamaraDeSeguridad camara = new CamaraDeSeguridad("Camara 1");
        AireAcondicionado aire = new AireAcondicionado("Aire 1");

    while(opcion!=4){
        System.out.println("Bienvenido al menú de sus dispositivos configurables\nEscoja cual desea configurar: ");
        System.out.println("1. Sensor de temperatura.\n2. Cámara de seguridad.\n3. Aire Acondicionado.\n4. Salir");
        opcion=scanner1.nextInt();
        switch (opcion){
            case 1:
                sensor.menu();
                break;
            case 2:
                camara.menu();
                break;
            case 3:
                aire.menu();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("El valor que ingresaste no es correcto");
        }
    }
    }
}
