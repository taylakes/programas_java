import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class TestComparator 
{
   public static void main (String [] args){
       ArrayList<Integer> numeros = new ArrayList<>();
       
       numeros.add(33);
       numeros.add(11);
       numeros.add(44);
       numeros.add(22);
       
       ArrayList<String> colores = new ArrayList<>();
       colores.add("Caleste");
       colores.add("Blanco");
       colores.add("Rojo");
       colores.add("Verde");
       colores.add("Azul");
       
       ArrayList<Persona> personas = new ArrayList<>();
       personas.add(new Persona(3333, "Luis", "Perez", 1.82,EstadoCivil.VIUDO));
       personas.add(new Persona(1111, "Maria", "Gomez", 1.66,EstadoCivil.DIVORCIADO));
       personas.add(new Persona(4444, "Pepe", "Lopez", 1.78,EstadoCivil.SOLTERO));
       personas.add(new Persona(2222, "Ana", "Jerez", 1.69,EstadoCivil.CASADO));  
       
       //Collections.sort(colores, new ComparadorDeCadenas()); //primero lista a comparar, y despues la clase que compara
       //mostrarLista(colores);
       
       
       ArrayList<Auto> autos = new ArrayList<>();
       autos.add(new Auto("KDJ664",6666));
       autos.add(new Auto("UYY587",5812));
       autos.add(new Auto("REG892",7841));
       autos.add(new Auto("AAE596",1502));  
       
       Collections.sort(autos, new ComparadorKilometraje(false)); //primero lista a comparar, y despues la clase que compara
       mostrarLista(autos);
   }
   
   public static void mostrarLista(List<?> lista){
       for(Object x: lista){System.out.println(x);} 
   }
}

