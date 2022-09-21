import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalcularAlertaEnjambreSismicoTest {

    @Test
    void calcularAlertaTest() {
        List<Integer> diasConEscalada = List.of(1,4,6,7,8,10);
        assertTrue(CalcularAlertaEnjambreSismico.calcularAlerta(diasConEscalada));
    }

    @Test
    void calcularAlertaFallaTest() {
        List<Integer> diasConEscalada = List.of(1,4,6,7,4,10);
        assertFalse(CalcularAlertaEnjambreSismico.calcularAlerta(diasConEscalada));
    }
}