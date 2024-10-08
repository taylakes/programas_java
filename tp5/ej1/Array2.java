
public class Array2
{
    public static void print(int[] arr)
    {
      print(arr,0,arr.length);
    }
    public static void print(String mensaje,int[] arr)
    {
        System.out.println(mensaje);
      print(arr,0,arr.length);
    }
    
     public static void print(String mensaje,int[] arr,int desde,int hasta)
    {
      System.out.println(mensaje);
      print(arr,desde,hasta);
    }
    
    public static void print(int[] arr,int desde,int hasta)
    {
      if (desde<0) desde=0;
      if (hasta>=arr.length) hasta=arr.length-1;
      System.out.print("[");
      for(int j=desde;j<=hasta;j++)
       System.out.print(arr[j]+",");
      System.out.print("]\n"); 
    }
    
    public static void print(double[] arr)
    {
      print(arr,0,arr.length);
    }
    public static void print(String mensaje,double[] arr)
    {
        System.out.println(mensaje);
      print(arr,0,arr.length);
    }
    
     public static void print(String mensaje,double[] arr,int desde,int hasta)
    {
      System.out.println(mensaje);
      print(arr,desde,hasta);
    }
    
    public static void print(double[] arr,int desde,int hasta)
    {
      if (desde<0) desde=0;
      if (hasta>=arr.length) hasta=arr.length-1;
      System.out.print("[");
      for(int j=desde;j<=hasta;j++)
       System.out.print(arr[j]+",");
      System.out.print("]\n"); 
    }
    
     public static void print(Object[] arr)
    {
      print(arr,0,arr.length);
    }
    public static void print(String mensaje,Object[] arr)
    {
        System.out.println(mensaje);
      print(arr,0,arr.length);
    }
    
     public static void print(String mensaje,Object[] arr,int desde,int hasta)
    {
      System.out.println(mensaje);
      print(arr,desde,hasta);
    }
    
    public static void print(Object[] arr,int desde,int hasta)
    {
      if (desde<0) desde=0;
      if (hasta>=arr.length) hasta=arr.length-1;
      System.out.print("[");
      for(int j=desde;j<=hasta;j++)
       System.out.print(arr[j]+",");
      System.out.print("]\n"); 
    }
    
    public static void print (boolean[]arreglo, int desde, int hasta){
        if (desde<0) {desde = 0;}
        if (hasta>arreglo.length){hasta = arreglo.length;}
        System.out.println("[");
        for (int j = desde; j<hasta;j++){System.out.print(arreglo[j]+",");}
        System.out.println("]");
    }
    
    public static void print(boolean[]arreglo){print(arreglo,0,arreglo.length);}
    
    public static void print(boolean[]arreglo, String mensaje){
        System.out.println(mensaje);
        print(arreglo);
    }
    
    public static void print(boolean[]arreglo, String mensaje, int desde, int hasta){
        System.out.println(mensaje);
        print(arreglo,desde,hasta);
    }
    
     public static void print (float[]arreglo, int desde, int hasta){
        if (desde<0) {desde = 0;}
        if (hasta>arreglo.length){hasta = arreglo.length;}
        System.out.println("[");
        for (int j = desde; j<hasta;j++){System.out.print(arreglo[j]+",");}
        System.out.println("]");
    }
    
    public static void print(float[]arreglo){print(arreglo,0,arreglo.length);}
    
    public static void print(float[]arreglo, String mensaje){
        System.out.println(mensaje);
        print(arreglo);
    }
    
    public static void print(float[]arreglo, String mensaje, int desde, int hasta){
        System.out.println(mensaje);
        print(arreglo,desde,hasta);
    }
    
}
