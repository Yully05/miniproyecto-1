package src.main.mini_1;

public class Fotocopiadora extends Servicio {

    private boolean color;
    private final static double COSTO_COLOR = 500; //costo fotocopia a color
    private static double COSTO_BN = 200; //costo fotocopia B/N

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

    public double calcularValorFotocopia(){
        if (color){
            return super.getCantidad() * COSTO_COLOR;
        }else{
            return super.getCantidad() * COSTO_BN;
        }
    }

    @Override
    public void registrarServicio(Negocio negocio) {
        negocio.getRegFotocopias().ejecutarRegistroFotocopias(this);
        System.out.println("--------------");
        System.out.println(negocio.getRegFotocopias().getRegistroFotocopias().toString());;
    }

    @Override
    public String toString() {
        String tipo= (color) ? "Color":"BN";
        return String.format("%s --- %d --- %.2f", tipo, super.getCantidad(), calcularValorFotocopia());
    }
}
