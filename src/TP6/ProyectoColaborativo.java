package TP6;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class ProyectoColaborativo {
    String empResponsable;
    List<String> progresoTareas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean estado;
    int eleccion;
    int inicioHistorial=0;
    public ProyectoColaborativo(String empResponsable) {
        this.empResponsable = empResponsable;
        this.estado = false;
        this.progresoTareas = new ArrayList<>();
    }
    public abstract void inicioTarea();
    public abstract void finTarea();
    public abstract void menu();
    public abstract String progresoActual();
    public abstract void calcularTiempo();
    List<String> obtenerHistorial(){
        return progresoTareas;
    }
}
