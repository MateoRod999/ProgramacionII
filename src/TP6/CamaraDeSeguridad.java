package TP6;

public class CamaraDeSeguridad extends Dispositivo{
    public CamaraDeSeguridad(String nombre) {
        super(nombre);
    }

    @Override
    void encender() {
        if(estado==true){
            System.out.println("La cámara ya está encendida.");
        }
        else{
            estado=true;
            registrarEstado("Encendido");
            System.out.println("La cámara se ha encendido.");
        }
    }

    @Override
    void apagar() {
        if(estado==false){
            System.out.println("La cámara ya está apagada");
        }
        else{
            estado=false;
            registrarEstado("Apagado");
            System.out.println("Se apagó la cámara");
        }
    }

    @Override
    String obtenerEstado() {
        return "Estado: "+ (estado ? "Encendido" : "Apagado");
    }

    @Override
    void menu() {
        while (eleccion!=5){
            eleccion=0;
            System.out.println("Este es el menú de la Cámara de seguridad, escoja una opción:\n1. Encender cámara.\n2. Apagar cámara\n3. Estado actual\n4. Historial de interacciones.\n5. Volver al menú.");
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
