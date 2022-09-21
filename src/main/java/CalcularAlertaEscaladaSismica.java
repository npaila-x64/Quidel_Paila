import java.util.ArrayList;
import java.util.List;

public class CalcularAlertaEscaladaSismica {

    public static List<Integer> calcularRegistro(double[][] matriz) {
        int contadorHorasConsecutivas = 0;
        List<Integer> diasObjetivo = new ArrayList<>();
        for (int diaIndice = 0; diaIndice < matriz.length; diaIndice++) {
            for (int gradoIndice = 0; gradoIndice < matriz[0].length; gradoIndice++) {
                if (matriz[diaIndice][gradoIndice] >= 6.0) {
                    contadorHorasConsecutivas++;
                } else {
                    contadorHorasConsecutivas = 0;
                }
                if (contadorHorasConsecutivas == 4) {
                    diasObjetivo.add(diaIndice + 1);
                    break;
                }
            }
        }
        return diasObjetivo;
    }

    public static void mostrarDias(double[][] matriz) {
        var diasObjetivo = calcularRegistro(matriz);
        System.out.println("Días en que se registraron sismos con grado mayor o igual que 5.5");
        for (int dia : diasObjetivo) {
            System.out.println(dia);
        }
    }
}
