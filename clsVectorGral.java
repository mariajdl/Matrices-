public class clsVectorGral
{
    //Atributos
    static int i;
    static String Dato;
    static clsGenerales objG = new clsGenerales();

    public clsVectorGral() //constructor
    { 
    }
    public int[ ] llenarEnteros (int[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerEntero(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public int[] llenarEnterosRango(int[] Vect, String Texto) {
        if(Vect != null) {
            for(i = 0; i < Vect.length; i++) {
                do {
                    Dato = "[" + i + "] " + Texto + ": ";
                    Vect[i] = objG.leerEntero(Dato);
                    if (Vect[i] < 0 || Vect[i] > 10) {
                        objG.Mensaje("Error, el valor debe estar entre 0 y 10. Inténtalo de nuevo.");
                    }
                } while (Vect[i] < 0 || Vect[i] > 10);
            }
        } else {
            objG.Mensaje("Error, vector vacío");
        }
        return Vect;
    }
    public int[ ] llenarEnterosPos (int[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerEnteroPos(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public int[ ] llenarEnterosPosMy0 (int[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerEnteroPosMy0(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public int[ ] llenarEnterosNeg (int[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerEnteroNeg(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public float[ ] llenarReales_f (float[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerReal_f(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public float[ ] llenarRealesPos_f (float[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerRealPos_f(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public float[] llenarRealesRango(float[] Vect, String Texto) {
        if(Vect != null) {
            for(i = 0; i < Vect.length; i++) {
                do {
                    Dato = "[" + i + "] " + Texto + ": ";
                    Vect[i] = objG.leerEntero(Dato);
                    if (Vect[i] < 0 || Vect[i] > 10) {
                        objG.Mensaje("Error, el valor debe estar entre 0 y 10. Inténtalo de nuevo.");
                    }
                } while (Vect[i] < 0 || Vect[i] > 10);
            }
        } else {
            objG.Mensaje("Error, vector vacío");
        }
        return Vect;
    }
    public float[ ] llenarRealesPosMy0_f (float[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerRealPos_f(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public float[ ] llenarRealesNeg_f (float[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerRealNeg_f(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public String[ ] llenarCadenas (String[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerCadena(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public String[ ] llenarCadenas2 (String[] Vect, String Texto)
    {
        if(Vect != null)
        {
            for(i = 0; i < Vect.length; i++)
            {
                Dato = "[" + i + "] " + Texto + ": ";
                Vect[ i ] = objG.leerCadena2(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
        return Vect;
    }
    public int sumarEnteros(int[] Vect)
    {
        int acum = 0;
        for(i = 0; i < Vect.length; i++)
            acum += Vect[i];
            return acum;
    }
    public float sumarReales(float[] Vect)
    {
        int acum = 0;
        for(i = 0; i < Vect.length; i++)
            acum += Vect[i];
            return acum;
    }
    public void mostrarEnteros(int[] Vect, String Texto)
    {
        if(Vect != null)
        {
            
            for(i = 0; i < Vect.length; i++)
            {
                Dato += "["+Vect[i]+"]" ;
                objG.Mensaje(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
    }
    public void mostrarReales_f(float[] Vect, String Texto)
    {
        if(Vect != null)
        {
            
            for(i = 0; i < Vect.length; i++)
            {
                Dato += "|"+Vect[i]+"|";
                objG.Mensaje(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
    }
    public void mostrarCadenas(String[] Vect, String Texto)
    {
        if(Vect != null)
        {
            Dato = Texto + "\n";
            for(i = 0; i < Vect.length; i++)
            {
                Dato += Vect[i] + "\n";
                objG.Mensaje(Dato);
            }
        }
        else
            objG.Mensaje("Error, vector vacío");
    }
    public static boolean buscarEnteroBoolean(int[] vector, int tam, int numero) {
        int i;
        for (i = 0; i <= tam - 1; i++) {
            if (vector[i] == numero)
            return true;
        }
        return false;

    }
    public  int cantNrosMy0OIguales(float[]vect, int tam, float numero)
   {

        int contVerdad =0,i;
        for (i=0; i <= tam-1;i++)
        {
            if (vect[i]>=numero) 
            {
               contVerdad++ ;
            }
        }
        return contVerdad;
   }
   public  int cantNrosMenores0OIguales(float[]vect, int tam, float numero)
   {

        int contVerdad =0,i;
        for (i=0; i <= tam-1;i++)
        {
            if (vect[i]<=numero) 
            {
               contVerdad++ ;
            }
        }
        return contVerdad;
   }
   public int cantNrosIguales(float[]vect, int tam, float numero)
   {
    int contVerdad =0,i;
    for (i=0; i <= tam-1;i++)
    {
        if (vect[i]==numero) 
        {
           contVerdad++ ;
        }
    }
    return contVerdad;
    

   }
   public float[] ordenarVectorBurbuja(float[] vector, int tam) {
    float[] vectorOrdenado = new float[tam];
    System.arraycopy(vector, 0, vectorOrdenado, 0, tam);

    for (int i = 0; i < tam - 1; i++) {
        for (int j = 0; j < tam - 1 - i; j++) {
            if (vectorOrdenado[j] > vectorOrdenado[j + 1]) {
                // Intercambiar elementos
                float temp = vectorOrdenado[j];
                vectorOrdenado[j] = vectorOrdenado[j + 1];
                vectorOrdenado[j + 1] = temp;
            }
        }
    }

    return vectorOrdenado;
}
    
    
}
