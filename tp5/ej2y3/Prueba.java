import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Prueba
{
    public static void main(String [] args){
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new Jefe("Juan", "Perez",15498.65));
        empleados.add(new Subordinado("Marcos", "Rodriguez",10,237));
        empleados.add(new Comision("Pepe", "Lopez",235,57));
        empleados.add(new Empleadoxhr("Emilio", "Funes",98,658,60));
        empleados.add(new Empleadoxhr("Juana", "Garcia",65,658,110));
        
        //Collections.sort(empleados, new ComparadorApellido());//punto 2
        //mostrarLista(empleados);
        
        //comparador generido se declara igual solo cambia el get y se ordena de A a Z
        Collections.sort(empleados, new Compara<>(Empleado::getNombre));
        mostrarLista(empleados);
    }
    
     public static void mostrarLista(List<?> lista){
       for(Object x: lista){System.out.println(x);} 
   }
}
