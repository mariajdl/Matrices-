import java.util.Scanner;
public class eleccion {

    public void ele(int M, int opt) {
        Scanner sc = new Scanner(System.in);
   
        switch (opt) {
            case 1:
                System.out.println("Pagina en manteniemiento");
                break;
            case 2:
                Taller mostrar=new Taller();
                String mensaje = "";  
                 mensaje = mostrar.Mayor(M);
                 System.out.println(mensaje);
                                
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