import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MetodosMatrizTest {
    @Test
    public void mostrarMatrizTest(){
        MetodosMatriz.mostrarMatriz(null);
    }
    @Test
    public void datosMayorSismoTest(){
        List<String> datos = MetodosMatriz.datosMayorSismo(null);
        assertNull(datos);
    }
    @Test
    public void valorRegistroRandom(){
        double valor = MetodosMatriz.valorRegistroRandom();
        for (int i = 0; i < 1000; i++) {
            assertTrue(valor>=0.5 && valor<=9.5);
        }

    }
}
