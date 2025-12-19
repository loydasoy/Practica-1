public class ejercicioMatrices {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {          // filas
            for (int j = 0; j < matriz[i].length; j++) {   // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // salto de línea por fila
        }
    }
}


