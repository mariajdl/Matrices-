//Encabezado
import javax.swing.JOptionPane;

public class clsGenerales 
{
   public clsGenerales( ) 
   {    //Constructor vacío
   }

   public void    Mensaje ( String Texto )
   {
      JOptionPane.showMessageDialog ( null, Texto );
   }
   public int     leerEntero ( String Texto )
   {  int vr;
      try
      {  vr = Integer.parseInt ( JOptionPane.showInputDialog( null, Texto ) );
         return vr;
      }
      catch( Exception ex )
      {  Mensaje( "Error, Tipo de dato entero no válido" );
         return leerEntero ( Texto );
      }  
   }
   public float   leerReal_f ( String Texto )
   {  float vr;
      try
      {  vr = Float.parseFloat ( JOptionPane.showInputDialog( null, Texto ) );
         return vr;
      }
      catch( Exception ex )
      {  Mensaje( "Error, Tipo de dato decimal corto(float) no válido" );
         return leerReal_f (Texto);
      }
   }
   public double   leerReal_d ( String Texto )
   {  double vr;
      try
      {  vr = Double.parseDouble ( JOptionPane.showInputDialog( null, Texto ) );
         return vr;
      }
      catch( Exception ex )
      {  Mensaje( "Error, Tipo de dato decimal largo(Double) no válido" );
         return  leerReal_d (Texto);
      }
    }


   public String  leerCadena ( String Texto )
   {  String Dato;
      Dato = JOptionPane.showInputDialog ( null, Texto ).trim( );
      return Dato;
   }
   //reformada

public  int leerEnteroPos ( String texto )
{ try
  { int Dato = Integer.parseInt( JOptionPane.showInputDialog( null, texto));
    if( Dato >= 0)
      return Dato;
    else
    { Mensaje( "Valor no valido, debe ser mayor o igual a cero, reintente por favor" );
      return leerEnteroPos( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerEnteroPos( texto );
  }
}
public  int leerEnteroPosMy0 ( String texto )
{ try
  { int Dato = Integer.parseInt( JOptionPane.showInputDialog( null, texto));
    if( Dato > 0)
      return Dato;
    else
    { Mensaje( "Valor no valido, debe ser mayor a cero, reintente por favor" );
      return leerEnteroPosMy0( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerEnteroPosMy0( texto );
  }
}
public  int leerEnteroNeg ( String texto )
{ try
  { int Dato = Integer.parseInt( JOptionPane.showInputDialog( null, texto));
    if( Dato < 0)
      return Dato;
    else
    { Mensaje( "Valor no valido, debe ser negativo (<0), reintente por favor" );
      return leerEnteroNeg( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerEnteroNeg( texto );
  }
}
public  float leerRealPos_f ( String texto )
{ try
  { float Dato = Float.parseFloat( JOptionPane.showInputDialog( null, texto));
    if( Dato >= 0)
      return Dato;
    else
    { Mensaje( "Valor no valido, debe ser mayor o igual a cero, reintente por favor" );
      return leerRealPos_f( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerRealPos_f( texto );
  }
}
public  float leerRealPosMy0 ( String texto )
{ try
  { float Dato = Float.parseFloat( JOptionPane.showInputDialog( null, texto));
    if( Dato > 0)
      return Dato;
    else
    { Mensaje( "Valor no valido, debe ser mayor a cero, reintente por favor" );
      return leerRealPosMy0( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerRealPosMy0( texto );
  }
}
public  float leerRealNeg_f ( String texto )
{ try
  { float Dato = Float.parseFloat( JOptionPane.showInputDialog( null, texto));
    if( Dato < 0)
      return Dato;
    else
    { Mensaje( "Valor no valido, debe ser negativo, reintente por favor" );
      return leerRealNeg_f( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerRealNeg_f( texto );
  }
}
public  String leerCadena2 ( String texto )
{ String Dato = JOptionPane.showInputDialog( null, texto ).trim();
  if ( Dato.isEmpty())
  { Mensaje( "Valor no valido, debe ser un diferente de vacio, reintente por favor" );
    return leerCadena2( texto );
  }
  else
    return Dato;
}
public  float leerNota_05 ( String texto )
{ try
  { float Dato = Float.parseFloat( JOptionPane.showInputDialog( null, texto));
    if( Dato >= 0 && Dato <= 5 )
      return Dato;
    else
    { Mensaje( "Nota no valida, debe estar entre 0 y 5 inclusive, reintente por favor" );
      return leerNota_05( texto );
    }
  }
  catch( Exception ex )
  { Mensaje( "Error, tipo de dato o valor no valido" );
     return leerNota_05( texto );
  }
 }
}
 //Fin de clase 
