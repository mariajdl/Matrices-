public class punto5{
   
    
    public static void  ImprimirComoVector(int[][]matriz){    
        System.out.println("\n --- MATRIZ GENERADA ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }      
       System.out.println("\n--- MATRIZ EN FORMATO DE VECTOR ---\n ");
       System.out.print("{");
       for (int i = 0; i < matriz.length; i++) {
        System.out.print("(");
        for (int j = 0; j < matriz[i].length; j++) {
            if (i > 0 || j > 0) System.out.print(" ");
            System.out.print(matriz[i][j]);
            }
            System.out.print(")");
            if (i < matriz.length - 1) System.out.print(",");
        }
       System.out.println("}\n");
    }
        
}    
    


