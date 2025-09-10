package TP6;

public class Electronicos extends AlmacenProductos implements ElectronicoAgregable{
    String periodoGarantia="";

    public Electronicos(String name) {
        super(name);
    }

    @Override
    void agregarProducto() {
        estado=1;
        System.out.println("Ingrese el nombre del producto: ");
        nombreProd=scanner.nextLine();
        System.out.println("Ingrese la marca del producto: ");
        marca=scanner.nextLine();
        garantia();
        calcularPrecio();
        listaStock.add("Nombre del producto: "+nombreProd+"Marca del producto"+marca+"; Precio:$ "+precioVenta+"; Periodo de garantia: "+periodoGarantia);

    }

    @Override
    public void garantia() {
        System.out.println("Ingrese el periodo de garantia del producto(por ejemplo '1 año'): ");
        periodoGarantia=scanner.nextLine();
    }
}
