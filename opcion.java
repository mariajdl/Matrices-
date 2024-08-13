import java.util.Scanner;
public class opcion {
    public int op() {
        Scanner sc = new Scanner(System.in);
        int opt;
        System.out.println("Ingresar el punto que desea ejecutar");        
        opt = sc.nextInt();
        return opt;
    }
}