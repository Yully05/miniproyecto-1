package main.quiz_1;

public class Operador {

    private String nombre;
    private double costoMinuto;
    private int cantidadMinutos;
    private double valorVenta;

    public Operador(int cantidadMinutos, String operador) {
        this.nombre = operador;
        this.cantidadMinutos = cantidadMinutos;
        this.valorVenta = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getCostoMinuto(){
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto){
        this.costoMinuto = costoMinuto;
    }

    public int getCantidadMinutos(){
        return cantidadMinutos;
    }

    public void setCantidadMinutos(int cantidadMinutos){
        this.cantidadMinutos = cantidadMinutos;
    }

    public double getValorVenta(){
        return valorVenta;
    }

    public void setValorVenta(double valorVenta){
        this.valorVenta = valorVenta;
    }

    private double Ganancia(){
        double costoVenta;
        costoVenta = getCantidadMinutos()*getCostoMinuto();
        return getValorVenta() - costoVenta;

    }
}
