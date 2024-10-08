
public class Fraccion
{
   private int numerador, denominador;
   
   public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
   public void sumar(Fraccion dos){
        int nnum = this.numerador * dos.denominador + dos.numerador * this.denominador;
        int nden = this.denominador * dos.denominador;
        System.out.println("El resultado de la suma es: "+nnum+"/"+nden);
    }
   
   public void resta(Fraccion dos){
        int nnum = this.numerador * dos.denominador + dos.numerador * this.denominador;
        int nden = this.denominador * dos.denominador;
        System.out.println("El resultado de la resta es: "+nnum+"/"+nden);
    }
   
   public void multiplicacion(Fraccion dos){
        int nnum = this.numerador * dos.numerador;
        int nden = this.denominador * dos.denominador;
        System.out.println("El resultado de la multiplicación es: "+nnum+"/"+nden);
    }
   
   public void division(Fraccion dos){
        int nnum = this.numerador * dos.denominador;
        int nden = this.denominador * dos.numerador;
        System.out.println("El resultado de la división es: "+nnum+"/"+nden);
    }
}
