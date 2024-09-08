package src.main.mini_1;

public class Fotocopiadora extends Servicio {

    private int cantidadCopias;
    private boolean color = false;
    private static double costoColor = 500; //costo fotocopia a color
    private static double costoBN = 200; //costo fotocopia B/N

    public Fotocopiadora(int copias, boolean color, double valor){
        super(valor);
        this.cantidadCopias = copias;
        this.color = color;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int copias){
        cantidadCopias = copias;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color){
        this.color = color;
    }

    public double calcularValorFotocopia(){
        if (color){
            return cantidadCopias * costoColor;
        }else{
            return cantidadCopias * costoBN;
        }
    }
    
}
