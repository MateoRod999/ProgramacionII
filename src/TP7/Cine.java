package TP7;

import java.util.ArrayList;
import java.util.List;
public class Cine {
    int cantAs;
    List<Asiento> asientos;
    int cantOcup;
    Asiento asiento;

    public Cine(int cantAs) {
        this.cantAs = cantAs;
        this.asientos = new ArrayList<>();
        this.cantOcup = 0;
        for (int i = 1; i <= cantAs; i++) {
            asientos.add(new Asiento("0"+i));
        }
    }
    public void comprarAsiento(String numeroAs) throws NoDisponibleException, AsientoException {
        if (cantOcup >= cantAs) {
            throw new NoDisponibleException("La Sala se encuentra llena, no hay asientos disponibles para comprar");
        }

        Asiento asientoEncontrado = null;
        for (Asiento a : asientos) {
            if (a.getNumAsiento().equalsIgnoreCase(numeroAs)) {
                asientoEncontrado = a;
                break;
            }
        }

        if (asientoEncontrado == null) {
            throw new AsientoException("El asiento: " + numeroAs + " es nulo, por favor ingrese un asiento valido");
        }

        if (asientoEncontrado.isOcupado()) {
            throw new NoDisponibleException("El Asiento: " + numeroAs + " ya no esta disponible.");
        }

        asientoEncontrado.ocuparAsiento();
        cantOcup++;
        System.out.println("El asiento: " + numeroAs + " fue reservado con exito.");
    }
    public void mostrarDisponibles() {
        System.out.println("----- Asientos disponibles -----");
        for (Asiento asiento : asientos) {
            if (!asiento.isOcupado()) {
                System.out.print("[" + asiento.getNumAsiento() + "] ");
            } else {
                System.out.print("[XX] ");
            }
        }
        System.out.println("\n--------------------------------");
    }
}

