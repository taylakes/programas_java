
public class EmpleadoAComision extends Empleado
{
    private int cantClientesCaptados;
    private double salarioMinimo,montoPorClientes;
    
    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, double montoPorClientes, int cantClientesCaptados){
        super(dni,nombre,apellido,anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorClientes = montoPorClientes;
    }
    
    public int getCantClientesCaptados(){return cantClientesCaptados;}
    
    @Override
    public double getSalario(){
        double sal = montoPorClientes*cantClientesCaptados;
        if (sal<salarioMinimo){sal = salarioMinimo;}
        return sal;
    }
}
