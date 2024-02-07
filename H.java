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
