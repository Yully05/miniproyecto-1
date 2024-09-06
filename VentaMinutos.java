public class VentaMinutos extends Servicio {

    private int minutos;
    private String operador;
    private static double costoMinutoClaro = 600;
    private static double costoMinutoMovistar = 500;
    private static double costoMinutoTigo = 300;


    public VentaMinutos(double valor, int tiempo, String operador) {
        super(valor);
        minutos = tiempo;
        this.operador = operador;
    }

    public int getMinutos(){
        return minutos;
    }

    public void setMinutos(int tiempo){
        minutos = tiempo;
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
                return minutos * costoMinutoClaro;
            case "movistar":
                return minutos * costoMinutoMovistar;
            case "tigo":
                return minutos * costoMinutoTigo;
            default:
                throw new AssertionError();
        }
    }
    
}
