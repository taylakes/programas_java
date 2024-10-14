import java.util.Comparator;
import java.util.function.Function;

public class Compara<T, U extends Comparable<U>> implements Comparator<T> 
{
    private Function<T, U> keyExtractor;

    public Compara(Function<T, U> keyExtractor) {
        this.keyExtractor = keyExtractor;
    }

    @Override
    public int compare(T o1, T o2) {
        return keyExtractor.apply(o1).compareTo(keyExtractor.apply(o2));
    }
}