package TP6;

public class Ropa extends AlmacenProductos implements RopaAgregable{
    String talle="";

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
            System.out.println("Almacen de ropa\nIngrese una opcion:\n1. Agregar un producto.\n2. Ver Stock.\n3. Volver al menu");
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
        System.out.println("Stock de Ropa:");
        if(estado!=0){
            System.out.println(stock());
        }
        else {
            System.out.println("No ha agregado ningun producto aun.");
        }
    }

    @Override
    public void detallesRopa() {
        System.out.println("Ingrese el talle de la prenda: ");
        talle=scanner.nextLine();
        System.out.println("Ingrese el marca de la prenda: ");
        marca=scanner.nextLine();
    }
}
