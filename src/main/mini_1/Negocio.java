package src.main.mini_1;

import src.main.mini_1.Registros.RegistroFotocopias;

public class Negocio {

    private double costoEnergia;
    private double sueldoTrabajador;
    private String nombreNegocio;
    private final RegistroFotocopias regFotocopias;
    private final RegistroMinutos regMinutos;

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

    public void regServicio(Fotocopiadora fotocopiadora) {
       this.regFotocopias.ejecutarRegistroFotocopias(fotocopiadora);
    }

    public void regServicio(VentaMinutos minutos) {
        this.regMinutos.ejecutarRegistroMinutos(minutos);
    }

    public void imprimirRecibosFotocopias(){
        System.out.println("--------------");
        System.out.println(this.regFotocopias);
        System.out.println("--------------");
    }


    public RegistroMinutos getRegMinutos(){
        return regMinutos;
    }

    public double calcularIngresos() {
        double ingresos = 0;

        for(Fotocopiadora fotocopiadora : regFotocopias.getRegistroFotocopias()){
            ingresos += fotocopiadora.calcularIngresoFotocopias();
        }

        for(VentaMinutos ventaMinutos : regMinutos.getRegistroMinutos()){
            ingresos += ventaMinutos.calcularValorMinuto();
        }


        System.out.printf("Los ingresos totales del día fueron: %.2f%n", ingresos);
        return ingresos;
    }

    public double calcularEgresos() {
        double egresos = 0;

        for(Fotocopiadora fotocopiadora : regFotocopias.getRegistroFotocopias()){
            egresos += fotocopiadora.calcularEgresoFotocopias();
        }

        for(VentaMinutos ventaMinutos : regMinutos.getRegistroMinutos()){
            egresos += ventaMinutos.calcularEgresoMinutos();
        }

        System.out.printf("Los costos operativos totales fueron: %.2f%n", egresos);
        return egresos;
    }

    public void calcularGanancia() {
        System.out.printf("La ganancia del día fue: %.2f%n",
                ( calcularIngresos() - calcularEgresos()));
    }



    
}
