import java.util.Comparator;


public class EdadComparator implements Comparator<Persona>
{
    //ordena por edad en orden inverso
    public int compare(Persona p1,Persona p2)
    {
        return (p1.getEdad()-p2.getEdad())*-1;
    }
}
