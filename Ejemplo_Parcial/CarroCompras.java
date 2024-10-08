import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class CarroCompras
{
    List<Productos> productos = new ArrayList<>();
    
    public void addProducto(Productos a){productos.add(a);}
    
    public double getValorTotal(){
        double total = 0;
        for(Productos a:productos)
            total+=a.getValor();
        return total;
    }
    
    public void imprimeListado(){
        Collections.sort(productos);
        for (Productos a:productos)
            System.out.println(a);
    }
}
