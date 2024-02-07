public class b {
    public static void main(String[] args) {
        int[] multiplosDeCinco = getMultiplosDeCinco(5, 100);
        int suma = sumaDeArray(multiplosDeCinco);

        System.out.println("La suma de los multiplos de 5 entre 5 y 100 es: " + suma);
        System.out.println("El promedio de los multiplos de 5 entre 5 y 100 es: " + suma / multiplosDeCinco.length);

        for (int i = 0; i < multiplosDeCinco.length; i++) {
            System.out.println("Multiplo de 5: " + multiplosDeCinco[i]);
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
    }
}
