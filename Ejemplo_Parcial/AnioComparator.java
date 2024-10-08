import java.util.Comparator;

public class AnioComparator implements Comparator<Automovil>
{
   public int compare (Automovil a1, Automovil a2){
       return a1.getAnio()-a2.getAnio(); 
   }
}
