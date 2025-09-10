package TP6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dispositivo {
    String nombre;
    boolean estado;
    List<String> historialEstados;
    int eleccion;
    Scanner scanner = new Scanner(System.in);


    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
        this.historialEstados = new ArrayList<>();
    }
    void encender(){
        if(estado==true){
            System.out.println("El dispositivo ya está encendido.");
        }
        else{
            estado=true;
            registrarEstado("Encendido");
            System.out.println("El dispositivo se ha encendido.");
        }
    }
    void apagar(){
        if(estado==false){
            System.out.println("El dispositivo ya está apagado");
        }
        else{
            estado=false;
            registrarEstado("Apagado");
            System.out.println("Se apagó dispositivo");
        }
    }
    String obtenerEstado(){
        return "Estado: "+ (estado ? "Encendido" : "Apagado");
    }
    void menu(){
        while (eleccion!=5){
            eleccion=0;
            System.out.println("Este es el menú del "+nombre+", escoja una opción:\n1. Encender "+nombre+"\n2. Apagar "+nombre+"\n3. Estado actual\n4. Historial de interacciones.\n5. Volver al menú.");
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

    void registrarEstado(String estado){
        historialEstados.add("\n "+LocalDateTime.now()+": "+estado);
    }
    List<String> obtenerHistorial(){
        return historialEstados;
    }
}
