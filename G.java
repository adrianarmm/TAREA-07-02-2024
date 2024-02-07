import java.util.Scanner;

public class f
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Introduce los elementos del primer vector:");
        leerVector(vector1);

        System.out.println("Introduce los elementos del segundo vector:");
        leerVector(vector2);


        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);
    }
public static void leerVector(int[] vector) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < vector.length; i++) {
        vector[i] = scanner.nextInt();
    }
}

public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
    int productoEscalar = 0;

    for (int i = 0; i < vector1.length; i++) {
        productoEscalar += vector1[i] * vector2[i];
    }


    return productoEscalar;
}
}