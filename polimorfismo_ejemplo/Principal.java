
public class Principal
{
    public static void main(String [] args){
        Empresa empresa = new Empresa();
        
        empresa.addEmpleado(new EmpleadoSalarioFijo("123","Ana","Lopez",2021,45000));
        empresa.addEmpleado(new EmpleadoAComision("123","Pepe","Gomez",2021,30000,100,500));
        empresa.addEmpleado(new EmpleadoSalarioFijo("123","Luis","Gamez",2019,50000));
        empresa.addEmpleado(new EmpleadoAComision("123","Leo","Torres",2017,30000,200,100));
        empresa.addEmpleado(new EmpleadoSalarioFijo("123","Maria","Perez",2014,10000));
        
        empresa.mostrarSalarios();
        
        System.out.println(empresa.empleadosConMasClientes().getNomYApe());
    }
}
