package src.main.mini_1;

public class Fotocopiadora extends Servicio {

    private boolean color;
    private final static double PRECIO_COLOR = 500;
    private final static double PRECIO_BN = 200;
    private final static double COSTO_COLOR = 200;
    private final static double COSTO_BN = 50;


    public Fotocopiadora(int cantidadCopias, boolean color){
        super(cantidadCopias);
        this.color = color;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color){
        this.color = color;
    }

    public double calcularIngresoFotocopias(){
        if (color){
            return super.getCantidad() * PRECIO_COLOR;
        }else{
            return super.getCantidad() * PRECIO_BN;
        }
    }

    public double calcularEgresoFotocopias(){
        return (color) ? super.getCantidad() * COSTO_COLOR : super.getCantidad() * COSTO_BN;
    }

    @Override
    public void registrarServicio(Negocio negocio) {
        negocio.regServicio(this);
    }

    @Override
    public String toString() {
        String tipo= (color) ? "Color":"BN";
        return String.format("%s ... %d ... %.2f",
                tipo,
                super.getCantidad(),
                calcularIngresoFotocopias());
    }
}
