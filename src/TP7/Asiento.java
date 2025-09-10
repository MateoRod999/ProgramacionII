package TP7;

public class Asiento {
    String numAsiento;
    boolean ocupado;
    String AsientoComprado;
    public Asiento(String numAsiento) {
        this.numAsiento = numAsiento;
        boolean ocupado=false;
        String AsientoComprado;

    }
    public void ocuparAsiento(){
        this.ocupado=true;
    }
    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
