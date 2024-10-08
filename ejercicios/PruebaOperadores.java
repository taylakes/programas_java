
/**
 * Write a description of class PruebaOperadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaOperadores extends numero
{
    public static void main (String [] args)
    {
        int x,suma;
        
        numero i,j;
        
        i= new numero();
        i.x=9;
        j=new numero();
        j.x=47;
        
        System.out.println("El valor de i es:"+i.x);
        System.out.println("El valor de j es:"+j.x);
        suma=i.x+j.x;
        System.out.println("El valor de la suma es:"+suma);
        System.out.printf("El valor de la suma es: %d \n\n Los valores individuales son: %d y %d \n",i.x+j.x,i.x,j.x);
        
        x=i.x;
        i.x=j.x;
        j.x=x;
        System.out.println("Luego de intercambiar los valores de i y j...\n");
        System.out.println("El valor de i:"+i.x);
        System.out.println("El valor de j:"+j.x);
    }
}
