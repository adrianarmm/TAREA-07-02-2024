public class Main {
    public static void main(String[] args) {
        int[] multiplosDeCinco = getMultiplosDeCinco(5, 100);
        int suma = sumaDeArray(multiplosDeCinco);

        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es: " + suma);
        System.out.println("Hay un total de " + multiplosDeCinco.length + " múltiplos de 5 entre 1 y 100:");

        for (int i = 0; i < multiplosDeCinco.length; i++) {
            System.out.println(multiplosDeCinco[i]);
        }
    }

    public static int[] getMultiplosDeCinco(int begin, int end) {
        int contador = 0;
        int[] multiplos = new int[(end - begin) / 5 + 1];

        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos[contador] = i;
                contador++;
            }
        }

        return multiplos;
    }

    public static int sumaDeArray(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return suma;
    }
}
