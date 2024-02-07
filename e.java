import java.util.ArrayList;

public class FactoresPrimos {
    public static void main(String[] args) {
        int numero = 40;
        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int i = 0; i < factoresPrimos.length; i++) {
            System.out.print(factoresPrimos[i] + " ");
        }
    }

    public static int[] descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        int divisor = 2;

        while (numero % 2 == 0) {
            factoresPrimos.add(2);
            numero /= 2;
        }

