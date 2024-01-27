
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestOrdenarNumeros {
    OrdenarNumeroCincoCifras ordenar=new OrdenarNumeroCincoCifras(56724);
    @Test
    public void separarNums(){
        int[] solucion = {4,2,7,6,5};
        assertArrayEquals(solucion,ordenar.separarNumeros());
    }

    @Test
    public void ordenarNums(){
        int[] solucion = {2,4,5,6,7};
        assertArrayEquals(solucion,ordenar.ordenarNumeros());
    }
}
