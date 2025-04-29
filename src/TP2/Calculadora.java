package TP2;

public class Calculadora {
    private double a,b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double sumar (double a, double b){
        return a+b;
    }
    public double restar (double a, double b){
        return a-b;
    }
    public double multiplicar (double a, double b){
        return a*b;
    }
    public double dividir (double a, double b){
        if (b==0){
            throw new IllegalArgumentException("No es posible dividir entre 0");
        }
        return a/b;
    }
}