package TP6;

import java.util.Scanner;

public class SensorTemperatura extends Dispositivo {
    public SensorTemperatura(String nombre) {
        super(nombre);
    }


    @Override
    void encender() {
        if(estado==true){
            System.out.println("El sensor ya está encendido.");
        }
        else{
            estado=true;
            registrarEstado("Encendido");
            System.out.println("El sensor de temperatura se ha encendido.");
        }
    }

    @Override
    void apagar() {
        if(estado==false){
            System.out.println("El sensor ya está apagado");
        }
        else{
            estado=false;
            registrarEstado("Apagado");
            System.out.println("Se apagó el sensor de temperatura");
        }

    }

    @Override
    String obtenerEstado() {
        return "Estado: "+ (estado ? "Encendido" : "Apagado"); //No sabía como poner para que diga "Encendido" en vez de true así que tuve que utilizar ayuda de la ia
    }

    @Override
    void menu() {
        while (eleccion!=5){
            eleccion=0;
            System.out.println("Este es el menú del Sensor de temperatura, escoja una opción:\n1. Encender sensor.\n2. Apagar sensor\n3. Estado actual\n4. Historial de interacciones.\n5. Volver al menú.");
            eleccion=scanner.nextInt();
            switch(eleccion) {
                case 1:
                    encender();
                    break;
                case 2:
                    apagar();
                    break;
                case 3:
                    System.out.println(obtenerEstado());
                    break;
                case 4:
                    System.out.println(obtenerHistorial());
                    break;
                case 5:
                    System.out.println("Redirigiendo al menú...");
                    break;
                default:
                    System.out.println("El valor ingresado no es correcto");
                    break;
            }
        }

    }
}
