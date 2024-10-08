import java.util.List;
import java.util.ArrayList;

public class Empresa
{
    List<Empleado> lista = new ArrayList<>();
    
    public void addEmpleado(Empleado e){lista.add(e);}

    public String getListado(){
        String listado = "";
        for (Empleado empleado:lista)
        listado+=empleado.toString() +"Sueldo: "+empleado.getSalario()+"\n";
        
        return listado;
    }
}
