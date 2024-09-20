package main.quiz_1;

public class Fotocopiadora {
    private double valorVenta;
    private int cantidadCopias;
    //true -> fotocopia a BN; y false -> fotocopia a color
    private boolean tipoDeCopia;
    private final static Map<Boolean, double[]> PrecioCostoFotocopiaMap = new HashMap<Boolean, double[]>() {{
            put(true, new double[]{50, 20});
            put(false, new double[]{500, 350});
        }};
    private static double ganancia;
    private static double costos;

    public Fotocopiadora(){}

    public Fotocopiadora(int cantidadCopias, boolean tipoDeCopia){
       this.cantidadCopias = cantidadCopias;
       this.tipoDeCopia = tipoDeCopia;
       this.valorVenta = this.cantidadCopias * this.PrecioCostoFotocopiaMap.get(this.tipoDeCopia)[0];
       this.costos += this.cantidadCopias * this.PrecioCostoFotocopiaMap.get(this.tipoDeCopia)[1];
       this.ganancia += this.valorVenta - this.costos;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public boolean getTipoDeCopia() {
        return tipoDeCopia;
    }

    public void setTipoDeCopia(boolean tipoDeCopia){
        this.tipoDeCopia = tipoDeCopia;
    }

    private double ganancia(){
        return this.ganancia;
    }

    private double costo(){
        return this.costos;
    }

}
