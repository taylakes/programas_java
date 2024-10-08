import java.util.ArrayList;

public class Principal
{
   public static void main(String [] args){
       ArrayList<Auto> autos = new ArrayList<>();
       
       autos.add(new Auto("ABC123","Verde",1065));
       autos.add(new Auto("DEF456","Rojo",6545));
       autos.add(new Auto("GHI789","Azul",3569));
       
       for (Auto a:autos){System.out.println(a.toString());}
       
       System.out.println("*************************");
       
       autos.remove(2);
       for (Auto a:autos){System.out.println(a.toString());}
       
       
   }
}