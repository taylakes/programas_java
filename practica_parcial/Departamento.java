import java.text.DecimalFormat;

/**
  El precio de un departamento se calcula en
  base a un precio por metro cuadrado, más el valor de las expensas.
 */

public class Departamento extends Inmueble
{
    private double precioMC2;
    private double valorExpensas;
    
    public Departamento(double mc, double precioMC2, double valorExpensas){
        super(mc);
        this.precioMC2 = precioMC2;
        this.valorExpensas = valorExpensas;
    }
    
    public double getMC(){
       return this.precioMC2; 
    }
    
    public double getExpensas(){
       return this.valorExpensas; 
    }
    
    @Override 
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Departamento: "+df.format(precio());
    }
    
    @Override
    public double precio(){
        return getMC()*getMeCuadrado() + getExpensas();
    }
}
