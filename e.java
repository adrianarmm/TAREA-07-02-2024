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