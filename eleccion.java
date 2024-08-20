import java.util.Scanner;

public class eleccion {

    public void ele(int M, int opt) {
        Scanner sc = new Scanner(System.in);
        switch (opt) {
            case 1:
                System.out.println("Pagina en manteniemiento");
                break;
            case 2:
                System.out.println("Pagina en mantenimiento");
                break;
            case 3:
                System.out.println("pagian en mantenimiento");
                break;
            case 4:
                System.out.println("Pagina en manteniemiento");
                break;
            case 5:
                System.out.println("Pagian en mantenimeinto");
                break;
            case 6:
                clsMatrizGral om = new clsMatrizGral();
                clsVectorGral oV = new clsVectorGral();
                Ejercicio6 ej6 = new Ejercicio6();
                int[][] matriz = new int[M][M];

                matriz = om.llenarRamdom(M);

                // om.mostrarEnteros(matriz, "");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println("\n");
                }

                int[] vet = new int[matriz.length];
                vet = ej6.sumarEnterosPorFilas(matriz);
                for (int i = 0; i < vet.length; i++) {
                    System.out.println("La suma de los elementos por fila es: "+vet[i]);
                }

                break;
            case 7:
                System.out.println("Pagina en mantenieminto");
                break;
            case 8:
                System.out.println("Pagina en mantenimiento");
                break;
            case 9:
                System.out.println("Pagina en mantenimiento");
                break;
            case 10:
                System.out.println("Pagina en mantenimiento");
                break;
            default:
                break;
        }
    }
}