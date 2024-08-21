public class puntoCuatro {

    public puntoCuatro(){
        
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
        
        for (int j = 0; j < 10; j++){
            if(sumaColumnas[j] < sumaMaxima){
                sumaMaxima = sumaColumnas[j];
                columnaMaxima = j;
                
            }
        }
        
        System.out.println("La columna con la suma mayor es: " + columnaMaxima);
        return columnaMaxima;
        
    }
}

    