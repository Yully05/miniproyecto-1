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
        StringBuilder registroMinToString = new StringBuilder();
        registroMinToString.append("Ref .. Operador .. Cantidad .. Valor pagado\n");
        for(VentaMinutos venta : registroMinutos) {
            registroMinToString.append(String.format("%d ... %s\n",
                    registroMinutos.indexOf(venta),
                    venta.toString()));
        }
        return registroMinToString.toString();
    }


}