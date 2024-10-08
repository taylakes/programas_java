import java.util.*;

public class ComparadorDeEnteros implements Comparator<Integer>
{
    //si yo vengo antes que la otra, retorna negativo
    //si yo voy despues que la otra, retorna positivo
    //si somos iguales, retorna un cero
        
    @Override
    public int compare(Integer o1, Integer o2){
        return o2 - o1; //mayor a menor
        //return o1 - o2; // menor a mayor 
    }
}
