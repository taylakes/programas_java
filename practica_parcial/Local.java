import java.text.DecimalFormat;

/**
  El precio de un local se calcula en base a un precio por metro cuadrado. 
 */

public class Local extends Inmueble
{
    private double precioMC2;
    
    public Local(double mc, double precioMC2){
        super(mc);
        this.precioMC2 = precioMC2;
    }
    
    public double getMC(){
       return this.precioMC2; 
    }
    
    @Override 
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Local: "+df.format(precio());
    }
    
    @Override
    public double precio(){
        return getMC()*getMeCuadrado();
    }
}
