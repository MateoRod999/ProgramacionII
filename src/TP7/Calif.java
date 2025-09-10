package TP7;

public class Calif {
    public Calif(int nota) throws NotaException{
        if(nota<0 || nota>10){
            throw new NotaException("La nota que ingreso es incorrecta, debe ingresar una nota entre 0-10.");
        }
        System.out.println("Su nota es valida.");
    }
}
