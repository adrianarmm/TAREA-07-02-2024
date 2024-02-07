import java.util.Random;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        rellenarMatrizSimetrica(matriz);

        imprimirMatriz(matriz);
    }
    public static void rellenarMatrizSimetrica(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = random.nextInt(20) - 10;
                    matriz[j][i] = matriz[i][j];
                }
            }
        }
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}