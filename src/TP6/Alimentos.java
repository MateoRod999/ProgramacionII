package TP6;

import java.time.LocalDate;

public class Alimentos extends AlmacenProductos implements AlimentoAgregable{
    int anio=0;
    int mes=0;
    int dia=0;
    LocalDate fechaDeHoy= LocalDate.now();
    @Override
    void agregarProducto() {
        estado=1;
        System.out.println("Ingrese el nombre del producto: ");
        nombreProd=scanner.nextLine();
        ingresarFechaVencimiento();
        calcularPrecio();
        listaStock.add("Nombre del producto: "+nombreProd+"; Precio:$ "+precioVenta+"; Fecha de vencimiento: "+dia+"-"+mes+"-"+anio+".");
    }

    @Override
    void calcularPrecio() {
        System.out.println("Ingrese el precio de compra se su producto para calcular el nuevo precio:$ ");
        precioCompra= scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de ganancia que desea obtener: %");
        ganancia=scanner.nextDouble();
        precioVenta= precioCompra+(precioCompra*(ganancia/100));
        System.out.println("Para obtener una ganancia de %"+ganancia+", el precio debe ser:$ "+precioVenta);
    }

    @Override
    void menu() {
        eleccion=0;
        while(eleccion!=3){
            System.out.println("Almacen de Alimentos\nIngrese una opcion:\n1. Agregar un producto.\n2. Ver Stock.\n3. Volver al menu");
            eleccion=scanner.nextInt();
            scanner.nextLine();
            switch (eleccion){
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    VerStock();
                    break;
                case 3:
                    System.out.println("Volviendo al menu...");
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta, vuelva a intentarlo.");
            }
        }
    }

    @Override
    void VerStock() {
        System.out.println("Stock de Alimentos:\t\t\tLa fecha de hoy es: "+fechaDeHoy);
        if(estado!=0){
            System.out.println(stock());
        }
        else {
            System.out.println("No ha agregado ningun producto aun.");
        }
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
