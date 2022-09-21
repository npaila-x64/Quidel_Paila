import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalcularRegistroMayorIgualQue5_5Test {

    @Test
    void calcularRegistroTest() {
        Double[][] matriz = new Double[3][2];
        matriz[0][0] = 0.9;
        matriz[0][1] = 5.0;
        matriz[1][0] = 6.0;
        matriz[1][1] = 2.0;
        matriz[2][0] = 8.0;
        matriz[2][1] = 7.0;
        var dias = CalcularRegistroMayorIgualQue5_5.calcularRegistro(matriz);
        assertEquals(List.of(2, 3), dias);
    }
}