package src.main.mini_1.Registros;

import java.util.ArrayList;
import src.main.mini_1.VentaMinutos;

public class RegistroMinutos {
    private static final ArrayList<VentaMinutos> registroMinutos = new ArrayList<>();

    public void ejecutarRegistroMinutos(VentaMinutos venta) {
        registroMinutos.add(venta);
    }

    public ArrayList<VentaMinutos> getRegistroMinutos() { return registroMinutos; }

    @Override
    public String toString() {
        StringBuilder registroFotoToString = new StringBuilder();
        for(VentaMinutos venta : registroMinutos) {
            registroFotoToString.append(String.format("%s\n", venta.toString()));
        }
        return registroFotoToString.toString();
    }
}