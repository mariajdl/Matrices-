public class MatrizAleatoria {
    private int[][] matriz;

    public int[][] llenarMatriz(int n) {
        matriz = new int[n][n];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 19-9);
            }
        }
        return matriz;
    }
}
