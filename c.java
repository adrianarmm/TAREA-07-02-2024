import java.util.Arrays;
public class TablaMultiplicar {
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

