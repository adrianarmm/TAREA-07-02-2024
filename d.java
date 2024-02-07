import java.util.Arrays;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int[][] tablas = generarPrimos(10);

        System.out.println("Los 10 primeros números primos son: ");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
         }
    }
    public static int[] generarPrimos(int n) {
       ArrayList<Integer> primos = new ArrayList<>();
       int contador;

        for (int i = 2; primos.size() < n; i++) {
            contador = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    contador++;
                    break;
                }
            }
            if (contador == 0) {
                primos.add(i);
            }