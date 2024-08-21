import java.io.IOException;
import java.util.Scanner;

public class eleccion {
    public void ele(int M, int opt) throws IOException {
        Scanner sc = new Scanner(System.in);
        cerosnegativospositivos c = new cerosnegativospositivos();

        switch (opt) {
            case 1:
                PuntoUno p1 = new PuntoUno();
                int suma = p1.calcular_suma();
                System.out.println("la suma es: " + suma);

                break;
            case 2:
                Taller mostrar = new Taller();
                String mensaje = "";
                mensaje = mostrar.Mayor(M);
                System.out.println(mensaje);

                break;
            case 3:
                sumaFilasYColumnas operacion = new sumaFilasYColumnas(M);

                int indice = 1;
                for (int elemento : operacion.sumaFilas()) {
                    System.out.println("La suma de la fila: " + indice + " es: " + elemento + " ");

                }
                System.out.println();
                indice = 1;
                for (int elemento : operacion.sumaColumnas()) {
                    System.out.println("La suma de la columna: " + indice + " es: " + elemento + " ");

                }
                break;
            case 4:
                puntoCuatro p4 = new puntoCuatro();
                p4.Cuatro(M);

                break;
            case 5:
                MatrizAleatoria nl = new MatrizAleatoria();
                int[][] m = nl.llenarMatriz(M);
                punto5.ImprimirComoVector(m);
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
                    System.out.println("La suma de los elementos por fila es: " + vet[i]);
                }

                break;
            case 7:
                c.contarmatriz(M);
                break;
            case 8:
                System.out.println("Pagina en mantenimiento");
                break;
            case 9:
                punto_9 p9 = new punto_9();
                p9.punto_nueve(M);
                break;
            case 10:
                System.out.println("Pagina en mantenimiento");
                break;
            case 11:
                Punto_once p11 = new Punto_once();
                p11.once(M);

                break;
            default:
                break;
        }
    }
}