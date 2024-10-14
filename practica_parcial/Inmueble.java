
public abstract class Inmueble
{
   private double metroCuadrado;
   
   public Inmueble(double metroCuadrado){
       this.metroCuadrado = metroCuadrado;
   }
   
   public double getMeCuadrado(){
       return this.metroCuadrado; 
   }
   
   public abstract String toString();

   public abstract double precio();
}
