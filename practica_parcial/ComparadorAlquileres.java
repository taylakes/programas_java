import java.util.*;

public class ComparadorAlquileres implements Comparator<Inmueble>
{ 
    private int multiplicador;
    
    public ComparadorAlquileres(boolean ascendente){
        if (ascendente) {multiplicador = 1;}
        else {multiplicador = -1;}
    }
    
    @Override
    public int compare(Inmueble o1, Inmueble o2){
        return Double.compare(o1.precio(), o2.precio()) * multiplicador;
    }
}
