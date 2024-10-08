import java.util.*;


public class Prueba2
{
    public static void main(String[] args)
    {
        Persona[] lista;
        lista=new Persona[3];
        
        lista[0]=new Persona("Perez",40);
        lista[1]=new Persona("Alvarez",25);
        lista[2]=new Persona("Gonzalez",75);
        
        Arrays.sort(lista);
        
        //imprimir lista
        
        for(Persona p:lista)
          System.out.println(p);
        
        Arrays.sort(lista,new EdadComparator());
        //segunda opcion, recorrer la lista
        
        for(int j=0;j<lista.length;j++)
        System.out.println(lista[j]);
        
       /* 
        //solo con Collections 
        Iterator<Persona> i=lista.iterator();
        while (i.hasNext()) 
        { Persona p1=i.next();
          System.out.println(p1);  
        }
        
        lista.forEach(System.out::println);*/
        
    }
}
