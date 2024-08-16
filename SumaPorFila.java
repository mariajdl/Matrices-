public class SumaPorFila 
{
    public int sumafila(int d){
    
    int suma = 0, fila = 0, result = 0;
    int[][] matriz = new int[d][d];
    MatrizAleatoria  matrizAleatoria= new MatrizAleatoria();
    matriz = matrizAleatoria.llenarMatriz(d);

        for (int i = 0; i < matriz[i].length; i++) 
     {

         for (int j = 0; j < matriz[j].length; j++)
          {
              fila = i+1;
             suma = suma + matriz[i][j];
              if (suma > result)
             {
                 result = suma; 
                    fila = i+1;
                }
          } 
    }
    System.out.println("La fila con mayor suma es: " + fila + "y el resutado es: " + result);
    return fila;
    }
} 