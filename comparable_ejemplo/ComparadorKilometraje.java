import java.util.*;

public class ComparadorKilometraje implements Comparator<Auto>
{
    private int multiplicador;
    
    public ComparadorKilometraje(boolean ascendente){
        if (ascendente) {multiplicador = 1;}
        else {multiplicador = -1;}
    }
    
    @Override
    public int compare(Auto o1, Auto o2){
        return multiplicador *(o1.getKM() - o2.getKM());
    }
}
