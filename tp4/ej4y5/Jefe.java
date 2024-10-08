
public class Jefe extends Empleado
{
    private double salario;
    
    public Jefe(String nom, String ap, double salario){
        super(nom,ap);
        this.salario = salario;
    }
    
    public void setSalario(double salario){this.salario = salario;}
    public double getSalario(){return salario;}
}
