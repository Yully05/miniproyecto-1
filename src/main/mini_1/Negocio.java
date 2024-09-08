package src.main.mini_1;

import java.util.ArrayList;

public class Negocio {

    private ArrayList<Servicio> servicios;
    private double costoEnergia;
    private double sueldoTrabajador;

    public Negocio(double energia, double sueldo) {
        this.servicios = new ArrayList<>();
        this.costoEnergia = energia;
        this.sueldoTrabajador = sueldo;
    }

    public double getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(double costoEnergia) {
        this.costoEnergia = costoEnergia;
    }

    public double getSueldoTrabajador() {
        return sueldoTrabajador;
    }

    public void setSueldoTrabajador(double sueldoTrabajador) {
        this.sueldoTrabajador = sueldoTrabajador;
    }

    public void registrarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    /*public double calcularDineroRecolectado() {
        
    }

    public double calcularCostosProduccion() {
        
    }

    public double calcularGanancia() {

    }
    */
    
}
