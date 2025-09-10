package TP6;

import java.time.LocalDate;

public class Alimentos extends AlmacenProductos implements AlimentoAgregable{
    int anio=0;
    int mes=0;
    int dia=0;
    LocalDate fechaDeHoy= LocalDate.now();

    public Alimentos(String name) {
        super(name);
    }

    @Override
    void agregarProducto() {
        estado=1;
        System.out.println("Ingrese el nombre del producto: ");
        nombreProd=scanner.nextLine();
        System.out.println("Ingrese la marca del producto: ");
        marca=scanner.nextLine();
        ingresarFechaVencimiento();
        calcularPrecio();
        listaStock.add("Nombre del producto: "+nombreProd+"; Marca del alimento: "+marca+"; Precio:$ "+precioVenta+"; Fecha de vencimiento: "+dia+"-"+mes+"-"+anio+".");
    }

    @Override
    public void ingresarFechaVencimiento() {
        System.out.println("Ingrese el dia de vencimiento (DD): ");
        dia=scanner.nextInt();
        System.out.println("Ingrese el mes de vencimiento (MM): ");
        mes=scanner.nextInt();
        System.out.println("Ingrese el año de vencimiento (AAAA): ");
        anio=scanner.nextInt();
    }
}
