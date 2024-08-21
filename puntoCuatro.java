public class puntoCuatro {

    public void Cuatro(int dim) {
        MatrizAleatoria ma = new MatrizAleatoria();
        int[][] matriz = new int[dim][dim];
        int[] sumacolumnas = new int[dim];
        matriz = ma.llenarMatriz(dim);
        puntoCuatro p4 = new puntoCuatro();
        sumacolumnas = p4.sumarColumnas(matriz);
        String sumamaxima = p4.SumaMaxima(matriz);
        for (int i = 0; i < sumacolumnas.length; i++) {
            System.out.println("la suma de la columna " + i + " es : " + sumacolumnas[i]);
        }
        System.out.println("la suma maxima es :" + sumamaxima);

    }

    public int[] sumarColumnas(int[][] matriz) {

        int[] sumaColumnas = new int[matriz.length];

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas[j] += matriz[i][j];
            }

        }

        return sumaColumnas;
    }

    public String SumaMaxima(int[][] sumaColumnas) {
        int columnaMaxima = 0;
        int sumaMaxima = sumaColumnas[0][0];

        for (int i = 0; i < sumaColumnas.length; i++) {
            for (int j = 0; j < sumaColumnas.length; j++) {
                if (sumaMaxima < sumaColumnas[j][i]) {
                    sumaMaxima = sumaColumnas[j][i];
                    columnaMaxima = i;

                }
            }

        }

        return "la suma maxima es: " + sumaMaxima + " y esta en la columna " + columnaMaxima;

    }
}
