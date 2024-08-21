
public class punto_9 {

    public void punto_nueve(int dim) {
        punto_9 p9 = new punto_9();
        MatrizAleatoria ma = new MatrizAleatoria();
        int[][] matriz = new int[dim][dim];
        matriz = ma.llenarMatriz(dim);
        int i_pos_max = 0, j_pos_max = 0;
        int i_pos_min = 0, j_pos_min = 0;
        String maximoNumero = p9.Max_Num(matriz, i_pos_max, j_pos_max);
        String minimoNumero = p9.Min_Num(matriz, i_pos_min, j_pos_min);
        String colMaxima = p9.col_max(matriz, i_pos_max, j_pos_max);
        String filaMax = p9.fil_max(matriz, i_pos_max, j_pos_max);
        System.out.println(maximoNumero);
        System.out.println(minimoNumero);
        System.out.println(colMaxima);
        System.out.println(filaMax);

    }

    public String Max_Num(int matriz[][], int i_pos_max, int j_pos_max) {

        String mensaje;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (max < matriz[i][j]) {

                    max = matriz[i][j];
                    i_pos_max = i;
                    j_pos_max = j;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "] ");

            }
            System.out.println(" ");
        }
        mensaje= "\n   El valor máximo es:  " + max + "y su posición es fila :" + (i_pos_max + 1) + "y la columna"+ (j_pos_max + 1);
        // mensaje = "\n El valor máximo es " + String.valueOf(max) + " y su posición es: [" + String.valueOf(i_pos_max + 1)
        //         + "][" + String.valueOf(j_pos_max + 1) + "]";    

        return mensaje;

    }

    public String Min_Num(int matriz[][], int i_pos_min, int j_pos_min) {

        String mensaje2;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (min > matriz[i][j]) {

                    min = matriz[i][j];
                    i_pos_min = i;
                    j_pos_min = j;

                }

            }

        }

        mensaje2 = "\nEl valor minimo es " + String.valueOf(min) + " y su posición es: ["
                + String.valueOf(i_pos_min + 1) + "][" + String.valueOf(j_pos_min + 1) + "]";

        System.out.println(mensaje2);
        return mensaje2;
    }

    public String col_max(int matriz[][], int i_pos_max, int j_pos_max) {

        String mensaje3 = "";
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (max < matriz[i][j]) {

                    max = matriz[i][j];
                    i_pos_max = i;
                    j_pos_max = j;
                }

            }

        }
        System.out.println("\ncolumna: " + (j_pos_max + 1));

        for (int i = 0; i < matriz.length; i++) {

            mensaje3 += "\n[" + matriz[i][j_pos_max] + "]";
        }

        System.out.println(mensaje3);

        return mensaje3;
    }

    public String fil_max(int matriz[][], int i_pos_max, int j_pos_max) {

        int max = Integer.MIN_VALUE;
        String mensaje4 = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (max < matriz[i][j]) {

                    max = matriz[i][j];
                    i_pos_max = i;
                    j_pos_max = j;
                }

            }

        }
        System.out.println("\nfila: " + (i_pos_max + 1));

        for (int j = 0; j < matriz.length; j++) {

            mensaje4 += "[" + matriz[i_pos_max][j] + "]";

        }

        System.out.println("\n" + mensaje4);
        return mensaje4;
    }
}