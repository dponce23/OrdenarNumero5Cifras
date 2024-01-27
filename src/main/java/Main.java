import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        OrdenarNumeroCincoCifras ordenar= new OrdenarNumeroCincoCifras(12345);
        System.out.println(Arrays.toString(ordenar.ordenarNumeros()));
    }
}
