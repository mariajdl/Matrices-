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
                sumaFilasYColumnas operacion=new sumaFilasYColumnas(M);
                
                int indice=1;
                for(int elemento: operacion.sumaFilas()){
                    System.out.print("La suma de la fila: "+indice+" es: "+elemento+" ");

                }
                System.out.println();
                for(int elemento: operacion.sumaColumnas()){
                    System.out.print("La suma de la columna: "+indice+" es: "+elemento+" ");

                }
                break;
            case 4:
                System.out.println("Pagina en manteniemiento");
                break;
            case 5:
                System.out.println("Pagian en mantenimeinto");
                break;
            case 6:
                System.out.println("Pagina en mantenimiento");
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