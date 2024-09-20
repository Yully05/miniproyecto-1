package main.quiz_1;

import java.util.ArrayList;

public class Negocio {

    private double costoEnergiaDia;
    private double costoEmpleadoDia;
    private Fotocopiadora fotocopiadora;
    private final ArrayList<Operador> Operadores;

    public Negocio(Fotocopiadora fotocopiadora, double energia, double sueldo) {
        this.costoEnergiaDia = energia;
        this.costoEmpleadoDia = sueldo;
        this.fotocopiadora = fotocopiadora;
        Operadores = new ArrayList<>();
    }

    public double getCostoEnergiaDia() {
        return costoEnergiaDia;
    }

    public void setCostoEnergiaDia(double costoEnergiaDia) {
        this.costoEnergiaDia = costoEnergiaDia;
    }

    public double getCostoEmpleadoDia() {
        return costoEmpleadoDia;
    }

    public void setCostoEmpleadoDia(double costoEmpleadoDia) {
        this.costoEmpleadoDia = costoEmpleadoDia;
    }

    public void Registrar(int copiasVenta){
        fotocopiadora.setCantidadCopias(copiasVenta);
        fotocopiadora.getValorVenta();


    }

    public void Registrar(int cantMinutos, String nombreOperador){
        Operador newOperador = new Operador(cantMinutos, nombreOperador);
        Operadores.add(newOperador);
    }

    public double cantidadDineroDia(){
        double cantidad = fotocopiadora.getValorVenta();
        for (Operador operador : Operadores) {
            cantidad += operador.getValorVenta();
        }
        return cantidad;
    }

    public double gananciaObtenida(){
        double ganancia = Fotocopiadora.getGanancia();
        for (Operador operador : Operadores) {
            ganancia += operador.Gananc();
        }
        return ganancia;
    }

    public double costoDia(){
        double costoMinutos = 0;
        for (Operador operador : Operadores) {
            costoMinutos += operador.getCostoMinuto();
        }
        return costoEnergiaDia + costoEmpleadoDia + fotocopiadora.getCostoVenta() + costoMinutos;
    }

}
