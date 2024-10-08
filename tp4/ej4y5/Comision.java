
public class Comision extends Empleado
{
    private static double porc;
    private double salario, ventas;
    
    public Comision(String nom, String ap, double salario, double ventas){
        super(nom,ap);
        this.salario = salario;
        this.ventas = ventas;
        porc = 0.2;
    }
    
    public void setPorcentaje(double porc){this.porc = porc;}
    public double getPorcentaje(){return porc;}
    
    public void setSalario(double salario){this.salario = salario;}
    public double getSalario(){return salario+(ventas*porc);}
    
    public void setVentas(double ventas){this.ventas = ventas;}
    public double getVentas(){return ventas;}

}
