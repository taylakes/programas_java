
public class Main
{
   public static void main(String[] args)
   {
       int[] a={1,2,3};
       double[] b={1.5,2.6,4.2};
       Perro[] c={new Perro("Boby"),new Perro("Sultan"),new Perro("Capitan")};
       
       System.out.print('\u000C');
       Array2.print(a);
       Array2.print("Arreglo Completo",a);
       Array2.print(a,1,2);
       Array2.print("Arreglo incompleto",a,1,2);
       
       Array2.print(b);
       Array2.print("Arreglo Completo",b);
       Array2.print(b,1,2);
       Array2.print("Arreglo incompleto",b,1,2);
       
       Array2.print(c);
       Array2.print("Arreglo Completo",c);
       Array2.print(c,1,2);
       Array2.print("Arreglo incompleto",c,1,2);
       
   }
}
