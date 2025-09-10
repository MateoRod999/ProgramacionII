package TP6;

public class Ropa extends AlmacenProductos implements RopaAgregable{
    String talle="";

    public Ropa(String name) {
        super(name);
    }

    @Override
    void agregarProducto() {
        estado=1;
        System.out.println("Ingrese el nombre de su nuevo producto: ");
        nombreProd=scanner.nextLine();
        detallesRopa();
        calcularPrecio();
        listaStock.add("Nombre del producto: "+nombreProd+"; Talle: "+talle+"; Marca de la prenda: "+marca+"; Precio:$ "+precioVenta);
    }
    @Override
    public void detallesRopa() {
        System.out.println("Ingrese el talle de la prenda: ");
        talle=scanner.nextLine();
        System.out.println("Ingrese el marca de la prenda: ");
        marca=scanner.nextLine();
    }
}
