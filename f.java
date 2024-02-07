import java.util.Scanner;

public class Mediana {
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
