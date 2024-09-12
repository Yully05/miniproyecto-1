package src.main.mini_1.Registros;

import java.util.ArrayList;
import src.main.mini_1.Fotocopiadora;

public class RegistroFotocopias {
    private static final ArrayList<Fotocopiadora> registroFotocopias = new ArrayList<>();

    public void ejecutarRegistroFotocopias(Fotocopiadora fotocopia) {
        registroFotocopias.add( fotocopia);
    }

    public ArrayList<Fotocopiadora> getRegistroFotocopias() {
        return registroFotocopias;
    }

    @Override
    public String toString() {
        StringBuilder registroFotoToString = new StringBuilder();
        registroFotoToString.append("Ref .. Tipo .. Cantidad .. Valor pagado\n");
        for(Fotocopiadora fotocopia : registroFotocopias) {
            registroFotoToString.append(String.format("%d ... %s\n",
                    registroFotocopias.indexOf(fotocopia),
                    fotocopia));
        }
        return registroFotoToString.toString();
    }
}
