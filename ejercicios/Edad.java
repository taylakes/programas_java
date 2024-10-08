
/**
 * Write a description of class Edad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Edad
{
    private int x;
    
     /**
     * Constructor for objects of class Edad.
     */
    public Edad (int edad)
    {
        x = edad;
    }
    
    public String votar()
    {
        return (x>18? "Es mayor y puede votar." :(x==18? "Es la primera vez que vota." : "Es menor y no puede votar."));
    }
}
