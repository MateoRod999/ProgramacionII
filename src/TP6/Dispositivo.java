package TP6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Dispositivo {
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
    abstract void encender();
    abstract void apagar();
    abstract String obtenerEstado();
    abstract void menu();

    void registrarEstado(String estado){
        historialEstados.add("\n "+LocalDateTime.now()+": "+estado);
    }
    List<String> obtenerHistorial(){
        return historialEstados;
    }
}
