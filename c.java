import java.util.Arrays;
public class c {
    public static void main(String[] args) {
        int[][] tablas = generarTablas(10);

        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del número " + (i + 1));
            for (int j = 0; j < tablas[i].length; j++) {
                       System.out.printf("%d x %d = %d%n", i + 1, j + 1, tablas[i][j]);
                     }
               System.out.println();
          }
}
    public static int[][] generarTablas(int numero) {
        int[][] tablas = new int[numero][numero];

        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[i].length; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        return tablas;
    }
}
