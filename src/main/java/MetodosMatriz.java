import java.util.ArrayList;
import java.util.List;

public class MetodosMatriz {

    public static double[][] generarMatriz(int n){
        return new double[n][24];
    }

    public static List<String> datosMayorSismo(double[][]matriz){
        List<String> datosMayorSismo= new ArrayList<>();
        double numMayor = 0;
        int diaMayorSismo = 0;
        int horaMayorSismo = 0;

        try{
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(matriz[i][j] > numMayor){
                        numMayor = matriz[i][j];
                        diaMayorSismo = i+1;
                        horaMayorSismo = j;
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("La matriz entregada es nula");
            return null;
        }
        datosMayorSismo.add("Día: "+String.valueOf(diaMayorSismo));
        datosMayorSismo.add("Hora: "+String.valueOf(horaMayorSismo));
        datosMayorSismo.add("Valor: "+String.valueOf(numMayor));

        return datosMayorSismo;
    }

    public static double valorRegistroRandom(){
        return (((int)(Math.random()*100)) % 91 + 5)/10.0;
    }

    public static void llenarMatriz(double[][]matriz){
        try{
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = valorRegistroRandom();
                }
            }
        }catch (NullPointerException e){
            System.out.println("La matriz entregada es nula");
        }
    }
    public static void mostrarMatriz(double[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Valor en la hora " + j + " :" + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
