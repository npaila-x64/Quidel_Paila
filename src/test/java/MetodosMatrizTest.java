import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MetodosMatrizTest {

    @Test
    public void mostrarMatrizTest(){
        MetodosMatriz.mostrarMatriz(null);
    }
    @Test
    public void datosMayorSismoTest(){
        MetodosMatriz.datosMayorSismo(null);
    }
}
