import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalcularRegistroMayorIgualQue5_5Test {


    double[][] matriz;

    @BeforeEach
    void initMatrizPrueba() {
        matriz = new double[1][24];
        matriz[0][0] = 1.0;
        matriz[0][1] = 1.0;
        matriz[0][2] = 1.0;
        matriz[0][3] = 1.0;
        matriz[0][4] = 5.0;
        matriz[0][5] = 1.0;
        matriz[0][6] = 1.0;
        matriz[0][7] = 1.0;
        matriz[0][8] = 1.0;
        matriz[0][9] = 1.0;
        matriz[0][10] = 1.0;
        matriz[0][11] = 1.0;
        matriz[0][12] = 2.0;
        matriz[0][13] = 2.0;
        matriz[0][14] = 2.0;
        matriz[0][15] = 2.0;
        matriz[0][16] = 3.0;
        matriz[0][17] = 1.0;
        matriz[0][18] = 1.0;
        matriz[0][19] = 1.0;
        matriz[0][20] = 1.0;
        matriz[0][21] = 1.0;
        matriz[0][22] = 1.0;
        matriz[0][23] = 1.0;
    }

    @Test
    void calcularRegistroFallaTest() {
        var dias = CalcularRegistroMayorIgualQue5_5.calcularRegistro(matriz);
        assertEquals(List.of(), dias);
    }
}