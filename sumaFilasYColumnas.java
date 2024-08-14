public class sumaFilasYColumnas {
    
    public sumaFilasYColumnas(){
    }
    
    public static int[] sumaFilas(int[][] matriz){
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
    
    public static int[] sumaColumnas(int[][] matriz){
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