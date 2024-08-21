public class cerosnegativospositivos {
    int negativos;
    int positivos;
    int ceros;

    public void contarmatriz(int m) {
        int[][] matriz = new int[m][m];
        MatrizAleatoria ma = new MatrizAleatoria();
        matriz = ma.llenarMatriz(m);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] < 0) {
                    negativos = negativos + 1;

                } else if (matriz[i][j] == 0) {
                    ceros = ceros + 1;

                } else if (matriz[i][j] > 0) {
                    positivos = positivos + 1;
                }

            }

        }

        System.out.println("Hay" + positivos + "numeros positivos en la matriz");
        System.out.println("Hay" + negativos + "numeros negativos en la matriz");
        System.out.println("Hay" + ceros + "numeros en cero en la matriz");
    }

}
