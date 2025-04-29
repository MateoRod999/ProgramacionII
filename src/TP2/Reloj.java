package TP2;

public class Reloj {
    private int horas, minutos, segundos;

    public int getHora() {
        return horas;
    }

    public int getMinuto() {
        return minutos;
    }

    public int getSegundo() {
        return segundos;
    }


    public void establecerHora(int horas, int minutos, int segundos) {
        boolean valido = true;

        if (horas < 0 || horas > 23) {
            System.out.println("La hora ingresada no es válida. Debe ingresar un valor entre 0 y 23.");
            valido = false;
        }
        if (minutos < 0 || minutos > 59) {
            System.out.println("El minuto ingresado no es válido. Debe ingresar un valor entre 0 y 59.");
            valido = false;
        }
        if (segundos < 0 || segundos > 59) {
            System.out.println("El minuto ingresado no es válido. Debe ingresar un valor entre 0 y 59.");
            valido = false;
        }

        if (valido) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("No se pudo establecer la hora por que los datos ingresados no son válidos.");
        }
    }

    public void mostrarHora() {
        System.out.printf("La hora ingresada es: %02d:%02d:%02d ", getHora(), getMinuto(), getSegundo());
    }

    public void avanzarSegundo() {
        segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minutos++;

        }
        if (this.minutos == 60) {
            this.minutos = 0;
            this.horas++;
        }
        if (this.horas == 24) {
            this.horas = 0;

        }
    }
}