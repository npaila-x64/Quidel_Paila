import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalcularAlertaEscaladaSismicaTest {

    Double[][] matriz;

    @BeforeEach
    void initMatrizPrueba() {
        matriz = new Double[1][24];
        matriz[0][0] = 1.0;
        matriz[0][1] = 1.0;
        matriz[0][2] = 1.0;
        matriz[0][3] = 1.0;
        matriz[0][4] = 5.5;
        matriz[0][5] = 1.0;
        matriz[0][6] = 1.0;
        matriz[0][7] = 1.0;
        matriz[0][8] = 1.0;
        matriz[0][9] = 1.0;
        matriz[0][10] = 1.0;
        matriz[0][11] = 1.0;
        matriz[0][12] = 6.0;
        matriz[0][13] = 7.0;
        matriz[0][14] = 8.0;
        matriz[0][15] = 7.0;
        matriz[0][16] = 8.0;
        matriz[0][17] = 1.0;
        matriz[0][18] = 1.0;
        matriz[0][19] = 1.0;
        matriz[0][20] = 1.0;
        matriz[0][21] = 1.0;
        matriz[0][22] = 1.0;
        matriz[0][23] = 1.0;
    }

    @Test
    void calcularRegistroTest() {
        var dias = CalcularAlertaEscaladaSismica.calcularRegistro(matriz);
        assertEquals(List.of(1), dias);
    }

    @Test
    void calcularRegistroFallaTest() {
        var dias = CalcularAlertaEscaladaSismica.calcularRegistro(matriz);
        assertNotEquals(List.of(), dias);
    }
}