import java.util.List;
import java.util.ArrayList;

public class Empresa
{
   private List<Empleado2> lista = new ArrayList();
   
   public void addEmpleado(String nombre, String apellido, String fecCon, String fecNac){
        Empleado2 empleado2 = new Empleado2(nombre, apellido, fecCon, fecNac);
        lista.add(empleado2);
    }
    
   public Empleado2 getUltimo(){
        if (lista.isEmpty()) {return null;}
        else {return lista.get(lista.size()-1);}
    }
}
