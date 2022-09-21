import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        MenuPrincipal.mostrarBienvenida();
    }

    public static void mostrarBienvenida() {
        System.out.print("""
                Bienvenido/a al analizador sísmico
                Ingrese el numero de días
                """.concat("Días> "));
        int dias = pedirNumeroDeDias();
        mostrarMenu(dias);
    }

    public static void mostrarMenu(int dias) {
        double[][] matriz = MetodosMatriz.generarMatriz(dias);
        MetodosMatriz.llenarMatriz(matriz);

        mostrarOpciones();
        salirMenu:
        while (true) {
            switch (pedirOpcion()) {
                case 0 -> {break salirMenu;}
                case 1 -> MetodosMatriz.mostrarMayorSismo(matriz);
                case 2 -> CalcularRegistroMayorIgualQue5_5.mostrarDias(matriz);
                case 3 -> CalcularAlertaEscaladaSismica.mostrarDias(matriz);
                case 4 -> CalcularAlertaEnjambreSismico.mostrarHayEnjambre(
                        CalcularAlertaEscaladaSismica.calcularRegistro(matriz));
                default -> {mostrarOpcionInvalida(); continue;}
            }
            mostrarOpciones();
        }
    }

    public static void mostrarOpciones() {
        System.out.print("""
                Escriba una opción
                [1] Ver menu intensidades
                [2] Ver días en total que se registraron sismos mayores que 5.5 grados
                [3] Menú alerta escalada sísmica
                [4] Menú alerta enhambre sísmico
                Si desea salir del sistema escriba [0]
                    """.concat("> "));
    }

    public static int pedirValorEntero() throws InputMismatchException {
        return new Scanner(System.in).nextInt();
    }

    public static int pedirValorNatural() throws InputMismatchException {
        int valor = new Scanner(System.in).nextInt();
        if (valor < 1 || valor > 365) {
            throw new InputMismatchException();
        }
        return valor;
    }

    public static int pedirOpcion() {
        try {
            return pedirValorEntero();
        } catch (InputMismatchException e) {
            mostrarOpcionInvalida();
            return pedirOpcion();
        }
    }

    public static int pedirNumeroDeDias() {
        try {
            return pedirValorNatural();
        } catch (InputMismatchException e) {
            mostrarValorInvalido();
            return pedirNumeroDeDias();
        }
    }

    public static void mostrarOpcionInvalida() {
        System.out.print("Por favor, escoja una opción válida\n> ");
    }
    public static void mostrarValorInvalido() {
        System.out.print("Por favor, escoja un número entre 0 y 365\n> ");
    }
}
