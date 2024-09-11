package src.main.mini_1;

public class VentaMinutos extends Servicio {

    private String operador;
    private static final double COSTO_MINUTO_CLARO = 600;
    private static final double COSTO_MINUTO_MOVISTAR = 500;
    private static final double COSTO_MINUTO_TIGO = 300;



    public VentaMinutos(int cantidadMinutos, String operador) {
        super(cantidadMinutos);
        this.operador = operador;
    }


    public String getOperador(){
        return operador;
    }

    public void setOperador(String operador){
        this.operador = operador;
    }

    public double calcularValorMinuto(){
        switch (operador) {
            case "claro":
                return super.getCantidad() * COSTO_MINUTO_CLARO;
            case "movistar":
                return super.getCantidad() * COSTO_MINUTO_MOVISTAR;
            case "tigo":
                return super.getCantidad() * COSTO_MINUTO_TIGO;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void registrarServicio(Negocio negocio) {
            negocio.regServicio(this);

    }
}
