package main.quiz_1;

import java.util.ArrayList;

public class Negocio {

    private double costoEnergiaDia;
    private double costoEmpleadoDia;
    private Fotocopiadora fotocopiadora;
    private final ArrayList<Operador> Operadores;

    public Negocio(double energia, double sueldo) {
        this.costoEnergiaDia = energia;
        this.costoEmpleadoDia = sueldo;
        this.fotocopiadora = new Fotocopiadora();
        this.Operadores = new ArrayList<Operador>();
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

    public void registrar(int cantidadcopias, boolean tipoFotocopia){
        return new Fotocopiadora(cantidadcopias, tipoFotocopia);
    }

    public void registrar(int cantMinutos, String nombreOperador){
        Operador newOperador = new Operador(cantMinutos, nombreOperador);
        Operadores.add(newOperador);
    }

    public double cantidadDineroDia(){
        double fotocopiasBruto = fotocopiadora.costo() + fotocopiadora.ganancia();
        double operadorBruto = 0.0;
        for (Operador operador : Operadores) {
            operadorBruto += operador.getValorVenta();
        }
        return operadorBruto + fotocopiasBruto;
    }

    public double gananciaObtenida(){
        return cantidadDineroDia() - costoDia();
    }

    public double costoDia(){
        double costoOperadores = 0.0;
        for (Operador operador : Operadores) {
            costoOperadores += operador.costos();
        }
        return this.costoEnergiaDia + this.costoEmpleadoDia + fotocopiadora.costo() + costoOperadores;
    }

}
