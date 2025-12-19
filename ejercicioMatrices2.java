public class ejercicioMatrices2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60}
        };

        int i = 0;
        while (i < matriz.length) {          // filas
            int j = 0;
            while (j < matriz[i].length) {   // columnas
                System.out.print(matriz[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
