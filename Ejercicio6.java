public class Ejercicio6 {
    static clsGenerales oh = new clsGenerales();
    static clsMatrizGral om = new clsMatrizGral();
    static clsVectorGral ov = new clsVectorGral();

    public int[] sumarEnterosPorFilas(int[][] Mat) {
        if (Mat == null) {
            oh.Mensaje("Matriz vacia");
            return new int[0]; // Retorna un vector vacío si la matriz es nula
        }

        int[] sumas = new int[Mat.length]; // Vector para almacenar las sumas de cada fila

        for (int i = 0; i < Mat.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < Mat[i].length; j++) {
                sumaFila += Mat[i][j];
            }
            sumas[i] = sumaFila; // Almacena la suma de la fila en el vector
        }

        return sumas;
    }

}
