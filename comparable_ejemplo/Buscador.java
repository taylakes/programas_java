import java.util.*;

public class Buscador<T extends Identificable, K> //T tipo de dato, K tipo de dato que permite identificar
{
    public T buscar(Collection<? extends T> elementos, K id){
        T encontrado = null;
        Iterator<? extends T> it = elementos.iterator();
        while (it.hasNext() && encontrado == null) {
            T actual = it.next();
            if (actual.sameId(id)) {
                encontrado = actual;
            }
        }
        return encontrado;
    }
}
