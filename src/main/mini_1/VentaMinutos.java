package src.main.mini_1;

public class VentaMinutos extends Servicio {

    private String operador;
    private static final double COSTO_MINUTO_CLARO = 600;
    private static final double COSTO_MINUTO_MOVISTAR = 500;
    private static final double COSTO_MINUTO_TIGO = 300;

    private static final double PRECIO_MINUTO_CLARO = 700;
    private static final double PRECIO_MINUTO_MOVISTAR = 600;
    private static final double PRECIO_MINUTO_TIGO = 500;


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
                return super.getCantidad() * PRECIO_MINUTO_CLARO;
            case "movistar":
                return super.getCantidad() * PRECIO_MINUTO_MOVISTAR;
            case "tigo":
                return super.getCantidad() * PRECIO_MINUTO_TIGO;
            default:
                throw new AssertionError();
        }
    }
    public double calcularEgresoMinutos(){
        switch (operador) {
            case "claro":
                return super.getCantidad() * COSTO_MINUTO_CLARO;
            case "movistar":
                return super.getCantidad() * COSTO_MINUTO_MOVISTAR;
            case "tigo":
                return super.getCantidad() * COSTO_MINUTO_TIGO;
        }
        return 0;
    }

    @Override
    public void registrarServicio(Negocio negocio) {
        System.out.println("--------------");
        System.out.print("La Llamada a " + operador);
        System.out.println(" por " + getCantidad() + " minutos, cuesta: " + calcularValorMinuto());
        negocio.regServicio(this);
    }

    @Override
    public String toString() {
        return String.format("%s ... %d ... %.2f",
                operador,
                super.getCantidad(),
                calcularValorMinuto());
    }
}
