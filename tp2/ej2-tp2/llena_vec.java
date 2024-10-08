import java.util.Random;

public class llena_vec
{
   private int vector[];
   
   public llena_vec(int tamaño)//determina el tamaño del array
   {
     vector= new int [tamaño];
   }
   
   public void ingresa_random()
   {
     Random num= new Random();
     for (int i=0; i<vector.length;i++){
         vector[i]=num.nextInt(10);
         System.out.println(vector[i]+" ");
     }
   }
   
   public int suma_valores()
   {
       int suma=0;
       for (int i=0;i<vector.length;i++) {
           suma= (suma + vector[i]);
       }
       return suma;
   }
}
