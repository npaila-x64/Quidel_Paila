public class MetodosMatriz {

    public static double[][] generarMatriz(int n){
        return new double[n][24];
    }

    public static double buscarMayorValorMatriz(double[][]matriz){
        double numMayor = 0;
        try{
            for (double[] dia : matriz) {
                for (double valorPorHora : dia) {
                    if (valorPorHora > numMayor) {
                        numMayor = valorPorHora;
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("La matriz entregada es nula");
            return 0;
        }
        return numMayor;
    }

    public static double valorRegistroRandom(){
        return (((int)(Math.random()*100)) % 91 + 5)/10.0;
    }

    public static void llenarMatriz(double[][]matriz){
        for (double[] dia : matriz) {
            for (double valorPorHora : dia) {
                valorPorHora = valorRegistroRandom();
            }
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
