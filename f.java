import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int cantidad = recibirNumeros(numeros);


        double media = calcularMedia(numeros, cantidad);
        int minimo = calcularMinimo(numeros, cantidad);
        int maximo = calcularMaximo(numeros, cantidad);

        System.out.println("La media es: " + media);
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);
    }


    public static int recibirNumeros(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Introduce números enteros. Para terminar, introduce un 0.");

        while (i < numeros.length && scanner.nextInt() != 0) {
            numeros[i] = scanner.nextInt();
            i++;
        }

        return i;
    }

    public static double calcularMedia(int[] numeros, int cantidad) {
        int suma = 0;


        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }

        return (double) suma / cantidad;
    }



    public static int calcularMinimo(int[] numeros, int cantidad) {
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
