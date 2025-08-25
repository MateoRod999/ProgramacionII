package TP6;

public class AireAcondicionado extends Dispositivo{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    void encender() {
        if(estado==true){
            System.out.println("El aire acondicionado ya está encendido.");
        }
        else{
            estado=true;
            registrarEstado("Encendido");
            System.out.println("El aire acondicionado se ha encendido.");
        }
    }

    @Override
    void apagar() {
        if(estado==false){
            System.out.println("El aire acondicionado ya está apagado");
        }
        else{
            estado=false;
            registrarEstado("Apagado");
            System.out.println("Se apagó el aire acondicionado");
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
            System.out.println("Este es el menú del aire acondicionado, escoja una opción:\n1. Encender aire.\n2. Apagar aire\n3. Estado actual\n4. Historial de interacciones.\n5. Volver al menú.");
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
