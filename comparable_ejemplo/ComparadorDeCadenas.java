import java.util.*;

public class ComparadorDeCadenas implements Comparator<String>
{
    //si yo vengo antes que la otra, retorna negativo
    //si yo voy despues que la otra, retorna positivo
    //si somos iguales, retorna un cero
        
    @Override
    public int compare(String o1, String o2){
        return o1.compareTo(o2);// de A a Z
        //return o2.compareTo(o1);// de Z a A
    }
}
