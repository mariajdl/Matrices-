public class puntoCuatro {

    public static void main(String[] args) {

    }

    private int[][] matriz;

    public int[][] llenarMatriz(int n) {
        matriz = new int[n][n];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 19 - 9);
            }
        }
        return matriz;
    }

    public int[] sumarColumnas(int[][] matriz) {

        int[] sumaColumnas = new int[10];

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i > 10; i++) {
                sumaColumnas[j] += matriz[i][j];
            }

        }

        return sumaColumnas;
    }

    public int SumaMaxima(int[] sumaColumnas) {
        int columnaMaxima = 0;
        int sumaMaxima = sumaColumnas[0];

        for (int j = 0; j < 10; j++) {
            if (sumaColumnas[j] < sumaMaxima) {
                sumaMaxima = sumaColumnas[j];
                columnaMaxima = j;

            }
        }

        System.out.println("La columna con la suma mayor es: " + columnaMaxima);
        return columnaMaxima;

    }
}


    