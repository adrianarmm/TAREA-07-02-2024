import java.util.ArrayList;
import java.util.Scanner;

public class MinMax   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (numero != -1) {
            System.out.println("Introduce un número entero (introduce -1 para terminar): ");
            numero = scanner.nextInt();

            if (numero != -1) {
                numeros.add(numero);
            }
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < min) {
                min = numeros.get(i);
            }

            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }

        System.out.println("El número más pequeño es: " + min);
        System.out.println("El número más grande es: " + max);
    }
}