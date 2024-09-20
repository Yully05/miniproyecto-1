package main.quiz_1;

public class Fotocopiadora {
    private double valorVenta;
    private int cantidadCopias;
    private boolean tipoDeCopia;
    private double costoBlancoNegro;
    private double costoColor;
    private static double ganancia;


    public Fotocopiadora(int cantidadCopias, boolean tipoDeCopia, double costoBlancoNegro, double costoColor/*, double valorVenta*/){
       this.cantidadCopias += cantidadCopias;
       this.tipoDeCopia = tipoDeCopia;
       this.valorVenta = 0;
       this.costoBlancoNegro = costoBlancoNegro;
       this.costoColor = costoColor;
       //Ganancia();
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public boolean getTipoDeCopia() {
        return tipoDeCopia;
    }

    public void setTipoDeCopia(boolean tipoDeCopia){
        this.tipoDeCopia = tipoDeCopia;
    }

    public static double getGanancia() {
        return ganancia;
    }

    private double Ganancia(){
        double gananciaVenta;
        if (tipoDeCopia){
            gananciaVenta = valorVenta - (getCantidadCopias()*costoColor);
        }else{
            gananciaVenta = valorVenta - (getCantidadCopias()*costoBlancoNegro);
        }
        return gananciaVenta;
    }

    private double getCostoVenta(boolean tipoDeCopia){
        if (tipoDeCopia){
            return getCantidadCopias()*costoColor;
        }else{
            return getCantidadCopias()*costoBlancoNegro;
        }
    }

}
