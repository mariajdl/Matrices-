
import java.util.Scanner;

public class eleccion {
    public void ele(int M, int opt) {
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
                    System.out.print("La suma de la fila: " + indice + " es: " + elemento + " ");

                }
                System.out.println();
                for (int elemento : operacion.sumaColumnas()) {
                    System.out.print("La suma de la columna: " + indice + " es: " + elemento + " ");

                }
                break;
            case 4:
                System.out.println("Pagina en manteniemiento");
                break;
            case 5:
                MatrizAleatoria nl = new MatrizAleatoria();
                int[][] m = nl.llenarMatriz(M);
                punto5.ImprimirComoVector(m);
                break;
            case 6:
                System.out.println("Pagina en mantenimiento");
                break;
            case 7:
                c.contarmatriz(M);
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