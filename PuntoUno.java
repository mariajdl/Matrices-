public class PuntoUno {
    public  int calcular_suma() {
        MatrizAleatoria obj = new MatrizAleatoria();
        obj.llenarMatriz(6);
        int suma = 0;
        int[][] matriz = obj.llenarMatriz(6);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - 1; j++) {
                System.out.print(matriz[i][j] + " ");

                suma = suma + matriz[i][j];
            }
            System.out.println(" ");
        }
        return suma;
    }
}
