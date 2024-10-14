import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Prueba
{
    public static void main(String [] args){
        ArrayList<Automovil> autos = new ArrayList<>();
        
        autos.add(new Automovil("Toyota", "2010",2024));
        autos.add(new Automovil("Jeep", "2019",2021));
        autos.add(new Automovil("Pepe", "2020",2020));
        
        System.out.println("Orden por marca:");
        Collections.sort(autos, new Compara<>(Automovil::getMarca));
        mostrarLista(autos);
        System.out.println();
        
        System.out.println("Orden por modelo:");
        Collections.sort(autos, new Compara<>(Automovil::getModelo));
        mostrarLista(autos);
        System.out.println();
        
        System.out.println("Orden por año:");
        Collections.sort(autos, new Compara<>(Automovil::getAnio));
        mostrarLista(autos);
    }
    
    public static void mostrarLista(List<?> lista){
       for(Object x: lista){System.out.println(x);} 
    }
}
