package TP6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DesarrolladorProyecto extends ProyectoColaborativo{
    public DesarrolladorProyecto(String empResponsable) {
        super(empResponsable);
    }
    LocalTime horaInicio;
    LocalTime horaFin;
    String fechaInicio;
    String fechaFin;


    @Override
    public void inicioTarea() {
        if (estado==false){
            inicioHistorial=1;
            estado=true;
            fechaInicio= String.valueOf(LocalDate.now());
            horaInicio= LocalTime.now();
            System.out.println("Ha comenzado con su tarea a las "+horaInicio+" Fecha: "+fechaInicio);
            progresoTareas.add("El desarrollador comenzo su trabajo a las horas: "+horaInicio+" Fecha: "+fechaInicio);
        }
        else{
            System.out.println("La tarea ya esta iniciada.");

        }
    }

    @Override
    public void finTarea() {
        if(estado==true){

            estado=false;
            fechaFin= String.valueOf(LocalDate.now());
            horaFin= LocalTime.now();
            System.out.println("Ha finalizado con su tarea a las "+horaFin+" Fecha: "+fechaFin);
            progresoTareas.add("El desarrollador finalizo su trabajo a las horas: "+horaFin+" Fecha: "+fechaFin);
        }
        else{
            System.out.println("No hay ninguna tarea en curso.");
        }

    }

    @Override
    public void menu() {
        while (eleccion!=4){
            eleccion=0;
            System.out.println("Bienvenido al menu para los desarrolladores del proyecto.\n1. Comenzar con su tarea.\n2. Finalizar su tarea.\n3. Calcular tiempo que se demoró en realizar la última tarea.\n4. Volver al menu de la empresa.\n");
            eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    inicioTarea();
                    break;
                case 2:
                    finTarea();
                    break;
                case 3:
                    calcularTiempo();
                    break;
                case 4:
                    System.out.println("Redirigiendo al menu...");
                    break;
                default:
                    System.out.println("La opcion que ha ingresado es incorrecta.");
            }
        }
    }

    @Override
    public String progresoActual() {
        return "Estado Desarrollador: "+ (estado ? "En progreso..." : "No hay ninguna tarea en progreso.");
    }

    @Override
    public void calcularTiempo() {
        if (horaInicio != null && horaFin != null) {
            Duration duracion = Duration.between(horaInicio, horaFin);
            long segundos = duracion.getSeconds();
            long horas = segundos / 3600;
            segundos %= 3600;
            long minutos = segundos / 60;
            segundos %= 60;

            System.out.println("Tiempo total invertido por el desarrollador en la tarea: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        } else {
            System.out.println("No hay ninguna tarea en progreso.");
        }
    }
}
