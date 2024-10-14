import java.util.ArrayList;
import java.util.*;
import java.text.DecimalFormat;

public class Principal
{
    public static void main(String [] args){
        ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
        
        listaInmuebles.add(new Casa(20.700, 5000));
        listaInmuebles.add(new Casa(30.267, 10000));
        listaInmuebles.add(new Local(6202, 3000));
        listaInmuebles.add(new Departamento(2000, 3000, 500));
        
        double total = 0;
        for(Inmueble im: listaInmuebles){
            total = total + im.precio();
        }
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("El total de todos los alquileres es: " + df.format(total));   
        
        Collections.sort(listaInmuebles, new ComparadorAlquileres(true));
        mostrarLista(listaInmuebles);
    }
    
    public static void mostrarLista(ArrayList<?> lista){
        for(Object x: lista){System.out.println(x);} 
    }
}
