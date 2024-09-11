package src.main.mini_1;

import src.main.mini_1.Registros.RegistroFotocopias;
import src.main.mini_1.VentaMinutos;

public class Negocio {

    private double costoEnergia;
    private double sueldoTrabajador;
    private String nombreNegocio;
    private final RegistroFotocopias regFotocopias;
    //private final RegistroMinutos regMinutos;

    public Negocio(double energia, double sueldo, String nombreNegocio) {
        regFotocopias = new RegistroFotocopias();
        //regMinutos = new registroMinutos();
        this.costoEnergia = energia;
        this.sueldoTrabajador = sueldo;
        this.nombreNegocio = nombreNegocio;
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

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public RegistroFotocopias getRegFotocopias() {
        return regFotocopias;
    }

//    public RegistroMinutos getRegMinutos(){
//        return regMinutos;
//    }


    /*public double calcularDineroRecolectado() {
        
    }

    public double calcularCostosProduccion() {
        
    }

    public double calcularGanancia() {

    }
    */
    
}
