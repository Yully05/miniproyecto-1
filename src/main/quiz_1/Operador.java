package main.quiz_1;

public class Operador {

    private Tipo operadorSeleccionado;
    private int cantidadMinutos;
    private double valorVenta;

    static public enum Tipo {
        MOVISTAR("Movistar", 200,100),
        TIGO("Tigo", 150, 75),
        UNE("Une", 250, 175),
        CLARO("Claro", 200, 120);

        private final String nombre;
        private final double precio;
        private final double costo;

        TipoProducto(String nombre, double precio, double peso) {
            this.nombre = nombre;
            this.precio = precio;
            this.peso = peso;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public double getCosto() {
            return peso;
        }
    }

    public Operador(Tipo tipoOperador, int cantidadMinutos) {
        this.operadorSeleccionado = tipoOperador;
        this.cantidadMinutos = cantidadMinutos;
        this.valorVenta = tipoOperador.getPrecio()*cantidadMinutos;
    }

    public int getCantidadMinutos(){
        return cantidadMinutos;
    }

    public void setOperadorSeleccionados(Tipo operadorSeleccionado){
        this.operadorSeleccionado = operadorSeleccionado;
    }

    public Tipo getOperadorSeleccionado(){
        return this.operadorSeleccionado;
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

    public double costos(){
        return this.operadorSeleccionado.getCosto()*this.cantidadMinutos;
    }
    
    public double ganancia(){
        return this.valorVenta - costos();
    }
    
}
