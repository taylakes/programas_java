
/**
 * Write a description of class PruebaEdad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaEdad
{
    public static void main(String [] args)
    {
        Edad x,y,j;
        
        x= new Edad(34);
        y= new Edad(18);
        j= new Edad(8);
        
        System.out.println("Para x:"+x.votar());
        System.out.println("Para y:"+y.votar());
        System.out.println("Para j:"+j.votar());
    }
}
