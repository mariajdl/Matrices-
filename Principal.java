import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        opcion o = new opcion();
        eleccion el = new eleccion();
        int M = 0;
        int opt;
        System.out.println("Ingrese la dimension de la matriz");
        M =sc.nextInt();
        opt = o.op();
        el.ele(M,opt);
    }
}