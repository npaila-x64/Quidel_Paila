import java.util.ArrayList;
import java.util.List;

public class CalcularRegistroMayorIgualQue5_5 {

    public static List<Integer> calcularRegistro(double[][] matriz) {
        List<Integer> diasObjetivo = new ArrayList<>();
        for (int diaIndice = 0; diaIndice < matriz.length; diaIndice++) {
            for (int gradoIndice = 0; gradoIndice < matriz[0].length; gradoIndice++) {
                if (matriz[diaIndice][gradoIndice] >= 9) {
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
        System.out.println("El total de días es de: " + diasObjetivo.size());
    }
}
