public class sumaFilasYColumnas {
    public int[][] matriz;

    public sumaFilasYColumnas(int m){

        MatrizAleatoria ma  = new MatrizAleatoria();

        matriz = new int[m][m];
        matriz = ma.llenarMatriz(m);
    }
    
    public int[] sumaFilas(){
        int [] vectorFila = new int[matriz.length];
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sum+= matriz[i][j];
                
            }
            vectorFila[i] = sum;
            sum=0;
        }
        return vectorFila;
    }
    
    public int[] sumaColumnas(){
        int [] vectorColumna = new int[matriz.length];
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sum+= matriz[j][i];
                
            }
            vectorColumna[i] = sum;
            sum=0;
        }
        return vectorColumna;
    }
    

}