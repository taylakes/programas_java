import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class CarroCompras
{
    List<Producto> productos = new ArrayList<>();
    
    public void addProducto(Producto a){productos.add(a);}
    
    public double getValorTotal(){
        double total = 0;
        for(Producto a:productos)
            total+=a.getValor();
        return total;
    }
    
    public void imprimeListado(){
        Collections.sort(productos);
        for (Producto a:productos)
            System.out.println(a);
    }
}

