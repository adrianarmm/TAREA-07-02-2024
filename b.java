public class b {
    public static void main(String[] args) {
        int[] multiplosDeCinco = getMultiplosDeCinco(5, 100);
        int suma = sumaDeArray(multiplosDeCinco);

        System.out.println("La suma de los multiplos de 5 entre 5 y 100 es: " + suma);
        System.out.println("El promedio de los multiplos de 5 entre 5 y 100 es: " + suma / multiplosDeCinco.length);

        for (int i = 0; i < multiplosDeCinco.length; i++) {
    }
}
