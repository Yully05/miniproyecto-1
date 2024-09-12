package src.main.mini_1;

public abstract class Servicio {

    private int cantidad;

    public Servicio(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public abstract void registrarServicio(Negocio negocio);
    
}
