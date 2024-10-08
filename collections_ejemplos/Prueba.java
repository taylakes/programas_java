import java.util.*;


public class Prueba
{
    public static void main(String[] args)
    {
        List<Persona> lista=new ArrayList();
        
        lista.add(new Persona("Perez",40));
        lista.add(new Persona("Alvarez",25));
        lista.add(new Persona("Gonzalez",75));
        
        Collections.sort(lista);
        
        //imprimir lista
        //1ra opcion
        System.out.println(lista);
        
        Collections.sort(lista,new EdadComparator());
        //segunda opcion, recorrer la lista
        
        for(int j=0;j<lista.size();j++)
        System.out.println(lista.get(j));
        
       /* for(Persona p:lista)
          System.out.println(p);
          
        Iterator<Persona> i=lista.iterator();
        while (i.hasNext()) 
        { Persona p1=i.next();
          System.out.println(p1);  
        }
        
        lista.forEach(System.out::println);*/
        
    }
}
