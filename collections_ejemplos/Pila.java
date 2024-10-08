import java.util.ArrayList;
import java.util.List;

public class Pila
{
     private List<Integer> elementos;
    
     public Pila() {elementos = new ArrayList<>();}
     
     public void push(int elemento) {elementos.add(elemento);}
     
     public int pop() {return elementos.remove(elementos.size() - 1);}
     
     public int peek() {return elementos.get(elementos.size() - 1);}
     
     public boolean isEmpty() {return elementos.isEmpty();}
}
