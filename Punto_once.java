import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Punto_once {

    public static void main(String[] args) throws IOException {
        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el número de estudiantes:");
        int N = Integer.parseInt(cp.readLine());

        Random aleatorio = new Random();

        double[][] calificaciones = new double[N][5];

        DecimalFormat df = new DecimalFormat("#.0");
        Punto_once llamado = new Punto_once();

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {

                calificaciones[i][j] = 1.0 + (4.0 * Math.random());
            }
        }

        System.out.println("Calificaciones de los estudiantes:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(df.format(calificaciones[i][j]) + "   ");
            }
            System.out.println("");
        }

        System.out.println(" Promedio de los estudiantes:");
        System.out.println();
        double[] promedios = llamado.promediosEst(calificaciones);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("El promedio del estudiante " + (i + 1) + " es: " + df.format(promedios[i]));
        }
        System.out.println("\n");

        System.out.println(" mejores calificaciones en la nota 3: ");
        int[] mejornota3 = llamado.mejorCalificacion(calificaciones, 2);
        System.out.println("Los estudiantes que obtuvieron la mejor calificación en la nota 3 fueron: ");
        int estudiante;
        for (int i = 0; i < mejornota3.length; i++) {
            estudiante = mejornota3[i];
            System.out.print("Estudiante " + (estudiante + 1));
            if (estudiante != 0) {
                break;
            }
        }
        System.out.println("\n");

        System.out.println("la mejor calificación en la nota 1: ");
        int[] mejornota1 = llamado.mejorCalificacion(calificaciones, 0);
        System.out.println("Los estudiantes que obtuvieron la mejor calificación en la nota 1 fueron: ");
        for (int i = 0; i < mejornota1.length; i++) {
            estudiante = mejornota1[i];
            System.out.print("Estudiante " + (estudiante + 1));
            if (estudiante != 0) {
                break;
            }
        }
        System.out.println("\n");

        System.out.println("la mejor calificación en la nota 5:");
        int[] mejornota5 = llamado.mejorCalificacion(calificaciones, 4);
        System.out.println("Los estudiantes que obtuvieron la mejor calificación en la nota 5 fueron: ");
        for (int i = 0; i < mejornota5.length; i++) {
            estudiante = mejornota5[i];
            System.out.print("Estudiante " + (estudiante + 1));
            if (estudiante != 0) {
                break;
            }
        }
        System.out.println("\n");

        System.out.println("El mejor promedio fue: " + llamado.BuscarmejorP(promedios));

    }

    public double[] promediosEst(double[][] calificaciones) {
        double[] promedios = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma = suma + calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones[i].length;
        }
        return promedios;
    }

    public int[] mejorCalificacion(double[][] calificaciones, int numExamen) {
        double mayor = 0;
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i][numExamen] > mayor) {
                mayor = calificaciones[i][numExamen];
            }
            if (calificaciones[i][numExamen] == mayor) {
                contador++;
            }

        }

        int[] estudiante = new int[contador];
        int num = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i][numExamen] == mayor) {
                estudiante[num++] = i;
            }
        }
        return estudiante;
    }
    public double BuscarmejorP(double[]promedios)
    {
        double mejorprom = 0;
        for (int i = 0; i<promedios.length; i++)
        {
            if (mejorprom<promedios[i])
            {
                mejorprom = promedios[i];
            }
        }
        return mejorprom;
    }

}
