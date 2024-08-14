public class Taller {

    public Taller(){

    }
    public String Mayor(int m) {

        int numeroMayor = 0;
        MatrizAleatoria ma  = new MatrizAleatoria();

        int[][] matriz = new int[m][m];
        matriz = ma.llenarMatriz(m);
        String mayorPosicion = "0,0";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                    mayorPosicion = i + "," + j;
                }

            }
        }

        return "El numero mayor de la matriz es " + String.valueOf(numeroMayor) + " en la posicion " + mayorPosicion;
    } 

}
