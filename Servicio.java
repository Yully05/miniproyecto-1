public class Servicio {

    private double valorPagado;

    public Servicio(double valor){
        this.valorPagado = valor;

    }

    public double getCosto(){
        return valorPagado;
    }

    public void setCosto(double valor){
        valorPagado = valor;

    }
    
}
