
//import clsGenerales;
public class clsMatrizGral 
{
     int i, j;
     String Dato;
     clsGenerales objG = new clsGenerales();
    //  clsMatrizGral mg = new clsMatrizGral();

    public clsMatrizGral()
    {
        //Constructor vacio
    }
    // public int [][] llenarEnteros (int [][] Mat, String Texto)
    // {   int nro;
    //     if ( Mat != null)
    //     {   for (i=0; i<Mat.length;i++)
    //             for (j=0; j<Mat[0].length;j++)
    //             {   Dato = "["+i+"],["+j+"] " +Texto+": ";
    //                 nro = objG.leerEntero(Dato);
    //                 Mat[i][j]=nro;
    //             }
    //     }
    //     else
    //         objG.Mensaje("Matriz vacía");
    //     return Mat;
    // }
    public int [][] llenarRamdom (int m)
    {   int [][]matriz=new int[m][m];
         
        MatrizAleatoria ma= new MatrizAleatoria();
        matriz= ma.llenarMatriz(m);
        
        return matriz;
    }
    public int [][] llenarRamdom2(int [][] Mat, String Texto)
    {   int nro;
        MatrizAleatoria ma= new MatrizAleatoria();
        // if ( Mat != null)
        // {   for (i=0; i<Mat.length;i++)
        //         for (j=0; j<Mat[0].length;j++)
        //         {   Dato = "["+i+"],["+j+"] " +Texto+": ";
        //             nro = objG.leerEnteroPos(Dato);
        //             Mat[i][j]=nro;
        //         }
        // }
        // else
        //     objG.Mensaje("Matriz vacía");
        // return null;
        Mat= ma.llenarMatriz(Mat.length);
        return Mat;
    }
    public int [][] llenarEnterosPosMy0 (int [][] Mat, String Texto)
    {   int nro;
        if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    nro = objG.leerEnteroPosMy0(Dato);
                    Mat[i][j]=nro;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public int [][] llenarEnterosNeg (int [][] Mat, String Texto)
    {   int nro;
        if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    nro = objG.leerEnteroNeg(Dato);
                    Mat[i][j]=nro;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public float [][] llenarReales_f (float [][] Mat, String Texto)
    {   float nro;
        if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    nro = objG.leerReal_f(Dato);
                    Mat[i][j]=nro;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public float [][] llenarRealesPos_f (float [][] Mat, String Texto)
    {   float nro;
        if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    nro = objG.leerRealPos_f(Dato);
                    Mat[i][j]=nro;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public float [][] llenarRealesPosMy0_f (float [][] Mat, String Texto)
    {   float nro;
        if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    nro = objG.leerRealPosMy0(Dato);
                    Mat[i][j]=nro;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public float [][] llenarRealesNeg_f (float [][] Mat, String Texto)
    {   float nro;
        if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    nro = objG.leerRealNeg_f(Dato);
                    Mat[i][j]=nro;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public String [][] llenarCadenas (String [][] Mat, String Texto)
    {   if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    Dato = objG.leerCadena(Dato);
                    Mat[i][j]=Dato;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public String [][] llenarCadenas2 (String [][] Mat, String Texto)
    {   if ( Mat != null)
        {   for (i=0; i<Mat.length;i++)
                for (j=0; j<Mat[0].length;j++)
                {   Dato = "["+i+"],["+j+"] " +Texto+": ";
                    Dato = objG.leerCadena2(Dato);
                    Mat[i][j]=Dato;
                }
        }
        else
            objG.Mensaje("Matriz vacía");
        return Mat;
    }
    public int sumarEnteros(int [][] Mat)
    { int acum=0;
        if(Mat!=null)
        {   for(i=0;i<Mat.length;i++)
                for(j=0;j<Mat[0].length;j++)
                    acum+=Mat[i][j];
        }
        else 
            objG.Mensaje("Matriz vacía");
        return acum;
    }
    public float sumarReales_f(float [][] Mat)
    { float acum=0;
        if(Mat!=null)
        {   for(i=0;i<Mat.length;i++)
                for(j=0;j<Mat[0].length;j++)
                    acum+=Mat[i][j];
        }
        else 
            objG.Mensaje("Matriz vacía");
        return acum;
    }
    public void mostrarEnteros (int [][] Mat, String Texto)
    {   if (Mat!=null)
        {   Dato=Texto+"\n";
            for(i=0;i<Mat.length;i++)
            {   Dato+=Mat[i][0];
                for(j=1;j<Mat[0].length;j++)
                    Dato+=",    "+Mat[i][j];
                Dato+="\n";
            }
            objG.Mensaje(Dato);
        }
        else
            objG.Mensaje("Matriz vacía");
    }
    public void mostrarReales_f (float [][] Mat, String Texto)
    {   if (Mat!=null)
        {   Dato=Texto+"\n";
            for(i=0;i<Mat.length;i++)
            {   Dato+=Mat[i][0];
                for(j=1;j<Mat[0].length;j++)
                    Dato+=",    "+Mat[i][j];
                Dato+="\n";
            }
            objG.Mensaje(Dato);
        }
        else
            objG.Mensaje("Matriz vacía");
    }
    public void mostrarCadenas (String [][] Mat, String Texto)
    {   if (Mat!=null)
        {   Dato=Texto+"\n";
            for(i=0;i<Mat.length;i++)
            {   Dato+=Mat[i][0];
                for(j=1;j<Mat[0].length;j++)
                    Dato+=",    "+Mat[i][j];
                Dato+="\n";
            }
            objG.Mensaje(Dato);
        }
        else
            objG.Mensaje("Matriz vacía");
    }
    private static void imprimirVectorEntero(int[] vect) {
        for (int i = 0; i <= vect.length - 1; i++) {
            System.out.println(vect[i]);

        }
    }
    private static void imprimirVectorReal(float[] vect) {
        for (int i = 0; i <= vect.length - 1; i++) {
            System.out.println(vect[i]);

        }
    }
}
