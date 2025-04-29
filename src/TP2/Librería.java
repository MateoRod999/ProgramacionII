package TP2;

import java.util.Scanner;

public class Librería {
private String libro;
private String autor;
private int isbn;
private String disponibilidad;

    public Librería(String libro, String autor, int isbn, String disponibilidad) {
        this.libro = libro;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidad = disponibilidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void prestar (){
        if (disponibilidad == "Disponible") {
            System.out.println("El libro se encuentra " + disponibilidad);
            disponibilidad= "No disponible";
            System.out.println("Usted ha retirado el libro: " +libro);
        }
        else {
            System.out.println("\nEl libro no se encuentra disponible, lo sentimos...\n");
        }
    }
    public void devolver(){
        if(disponibilidad == "No disponible"){
            System.out.println("\nEl libro ¨" +libro +"¨ fue devuelto con éxito.\n");
            disponibilidad = "Disponible";
        }else {
            System.out.println("\nEl libro ya se encuentra en nuestra librería\n");
        }
    }
    public void mostrarInfo(){
        System.out.println("\nNombre del libro: "+libro+"\nAutor "+autor+"\nISBN: "+isbn+"\nDisponibilidad: "+disponibilidad);
    }
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int decision = 0;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1.Mostrar información");
            System.out.println("2.Retirar libro");
            System.out.println("3.Devolver libro");
            System.out.println("4.Volver al menú");
            decision = sc.nextInt();
            switch (decision) {
                case 1:
                    mostrarInfo();
                    break;
                case 2:
                    prestar();
                    break;
                case 3:
                    devolver();
                    break;
                case 4:
                    System.out.println("Redirigieno al menú...");
                    break;
                default:
                    System.out.println("Ingresó un carácter incorrecto. Vuelva a intentarlo...");
            }
        }while (decision!=4);

    }
}

