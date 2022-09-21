import java.util.ArrayList;
import java.util.List;

public class CalcularAlertaEnjambreSismico {

    public static boolean calcularAlerta(List<Integer> diasConEscalada) {
        int contadorDiasConsecutivos = 1;
        int diaAnterior = diasConEscalada.get(0);
        for (int diaIndice = 1; diaIndice < diasConEscalada.size(); diaIndice++) {
            int diaSiguiente = diasConEscalada.get(diaIndice);
            if (diaAnterior == diaSiguiente - 1) {
                contadorDiasConsecutivos++;
            } else {
                contadorDiasConsecutivos = 1;
            }
            if (contadorDiasConsecutivos == 3) {
                return true;
            }
            diaAnterior = diaSiguiente;
        }
        return false;
    }

    public static void mostrarHayEnjambre(List<Integer> diasConEscalada) {
        boolean hayEnjambre = calcularAlerta(diasConEscalada);
        if (hayEnjambre) {
            System.out.println("Hay enjambre sísmico");
        } else {
            System.out.println("No hay enjambre sísmico");
        }
    }
}
