import java.util.ArrayList;
import java.util.List;

public class MetodosMatriz {

    public static double[][] generarMatriz(int n){
        return new double[n][24];
    }

    public static void mostrarMayorSismo(double[][]matriz){
        List<String> datos = datosMayorSismo(matriz);
        System.out.println("Mayor Sismo: " + datos);
    }

    public static List<String> datosMayorSismo(double[][]matriz){
        List<String> datosMayorSismo= new ArrayList<>();
        double numMayor = 0;
        int diaMayorSismo = 0;
        int horaMayorSismo = 0;

        try{
            for (int dia = 0; dia < matriz.length; dia++) {
                for (int hora = 0; hora < matriz[dia].length; hora++) {
                    if(matriz[dia][hora] > numMayor){
                        numMayor = matriz[dia][hora];
                        diaMayorSismo = (dia+1);
                        horaMayorSismo = hora;
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("La matriz entregada es nula");
            return null;
        }
        datosMayorSismo.add("Dia: " + diaMayorSismo);
        datosMayorSismo.add("Hora: " + horaMayorSismo);
        datosMayorSismo.add("Valor: " + numMayor);

        return datosMayorSismo;
    }

    public static double valorRegistroRandom(){
        return (((int)(Math.random()*100)) % 91 + 5)/10.0;
    }

    public static void llenarMatriz(double[][]matriz){
        try{
            for (int dia = 0; dia < matriz.length; dia++) {
                for (int hora = 0; hora < matriz[dia].length; hora++) {
                    matriz[dia][hora] = valorRegistroRandom();
                }
            }
        }catch (NullPointerException e){
            System.out.println("La matriz entregada es nula");
        }
    }
    public static void mostrarMatriz(double[][]matriz){
        try{
            for (int dia = 0; dia < matriz.length; dia++) {
                System.out.println("Dia " + (dia+1));
                for (int hora = 0; hora < matriz[dia].length; hora++) {
                    System.out.println("Valor en la hora " + hora + " :" + matriz[dia][hora]);
                }
                System.out.println();
            }
        }catch (NullPointerException e){
            System.out.println("La matriz entregada es nula");
        }
    }
}
