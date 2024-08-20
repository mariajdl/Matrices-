

package punto_9;

public class nueve {

    int[][] matriz;
    int i_pos_max = 0, j_pos_max = 0;
    int i_pos_min = 0, j_pos_min = 0;

    public String Max_Num(int matriz[][]) {

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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "] ");

            }
            System.out.println(" ");
        }

        mensaje = "\nEl valor máximo es " + String.valueOf(max) + " y su posición es: [" + String.valueOf(i_pos_max + 1) + "][" + String.valueOf(j_pos_max + 1) + "]";

        System.out.println(mensaje);

        return mensaje;

    }

    public String Min_Num(int matriz[][]) {

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

        mensaje2 = "\nEl valor minimo es " + String.valueOf(min) + " y su posición es: [" + String.valueOf(i_pos_min + 1) + "][" + String.valueOf(j_pos_min + 1) + "]";

        System.out.println(mensaje2);
        return mensaje2;
    }

    public String col_max(int matriz[][]) {

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

    public String fil_max(int matriz[][]) {

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