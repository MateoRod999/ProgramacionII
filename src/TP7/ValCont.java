package TP7;

import java.util.Scanner;

public class ValCont {
    public ValCont(String contra)throws InvalidException{
        boolean num=false;
        if (contra.length()<8){
            throw new InvalidException("La contraseña que ingreso no cumple con el requisito minimo de caracteres solicitado.");
        }
        if(contra==null|| contra.isEmpty()){
            throw new InvalidException("La contraseña que ingreso, es nula o no tiene ningun caracter.");
        }
        for(int i=0;i<contra.length();i++){
            if(Character.isDigit(contra.charAt(i))){
                num=true;
                break;
            }
        }
        if(!num){
            throw new InvalidException("La contraseña debe contener al menos un numero.");
        }
        System.out.println("La contraseña es valida, puede utilizarla.");
    }
}
