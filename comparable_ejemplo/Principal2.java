import java.util.ArrayList;

public class Principal2
{
    public static void main(String[] args) {
        ArrayList<Auto2> autos = new ArrayList<>();
        autos.add(new Auto2("BCD234", "Verde"));
        autos.add(new Auto2("DEF458", "Blanco"));
        autos.add(new Auto2("CDE345", "Azul"));
        autos.add(new Auto2("DEF457", "Gris"));
        
        Buscador<Auto2, String> buscadorDeAutosPorPatente;
        buscadorDeAutosPorPatente = new Buscador<>();
        Auto2 a = buscadorDeAutosPorPatente.buscar(autos, "CDE345");
        System.out.println(a);
        
        ArrayList<Persona2> personas = new ArrayList<>();
        personas.add(new Persona2(1234, "Pepe", "Gomez"));
        personas.add(new Persona2(1596, "Ana", "Perez"));
        personas.add(new Persona2(7645, "Luis", "Lopez"));
        personas.add(new Persona2(2345, "Lía", "Alvarez"));
        personas.add(new Persona2(4763, "Sara", "Britez"));
        
        Buscador<Persona2, Integer> buscadorDePersonasPorDNI;
        buscadorDePersonasPorDNI = new Buscador<>();
        Persona2 p = buscadorDePersonasPorDNI.buscar(personas, 2345);
        System.out.println(p);
    }
}
