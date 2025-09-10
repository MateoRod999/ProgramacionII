package TP6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AlmacenProductos {
    double precioCompra;
    double precioVenta;
    double ganancia;
    int estado;
    String nombreProd;
    Scanner scanner = new Scanner(System.in);
    List<String> listaStock= new ArrayList<>();
    int eleccion=0;
    String marca="";
    String name;

    public AlmacenProductos(String name) {
        this.nombreProd = nombreProd;
        this.marca= marca;
        this.name=name;
        this.precioCompra= 0;
        this.estado=0;
        this.precioVenta= 0;
        this.ganancia=0;
        this.listaStock= new ArrayList<>();
    }
    abstract void agregarProducto();
    void calcularPrecio(){
            System.out.println("Ingrese el precio de compra se su producto para calcular el nuevo precio:$ ");
            precioCompra= scanner.nextDouble();
            System.out.println("Ingrese el porcentaje de ganancia que desea obtener: %");
            ganancia=scanner.nextDouble();
            precioVenta= precioCompra+(precioCompra*(ganancia/100));
            System.out.println("Para obtener una ganancia de %"+ganancia+", el precio debe ser:$ "+precioVenta);

    }
    void menu(){
            eleccion=0;
            while(eleccion!=3){
                System.out.println("Almacen de "+name+"\nIngrese una opcion:\n1. Agregar un producto.\n2. Ver Stock.\n3. Volver al menu");
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
    void VerStock(){
        System.out.println("Stock de "+name+":");
        if(estado!=0){
            System.out.println(stock());
        }
        else {
            System.out.println("No ha agregado ningun producto aun.");
        }
    }
    List<String> stock(){
        return listaStock;
    }

}
