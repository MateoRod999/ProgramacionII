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

    public AlmacenProductos() {
        this.nombreProd = nombreProd;
        this.precioCompra= 0;
        this.estado=0;
        this.precioVenta= 0;
        this.ganancia=0;
        this.listaStock= new ArrayList<>();
    }
    abstract void agregarProducto();
    abstract void calcularPrecio();
    abstract void menu();
    abstract void VerStock();
    List<String> stock(){
        return listaStock;
    }

}
