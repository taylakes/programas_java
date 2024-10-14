import java.text.DecimalFormat;

/**
  El precio de alquiler de una casa se calcula en base al precio por metro cuadrado
  de vivienda, más un precio por metro cuadrado de terreno (el precio del metro cuadrado de terreno
  es el 50% del valor del metro cuadrado de vivienda).
 */

public class Casa extends Inmueble
{
    private double precioMC2vivienda;
    private double precioMC2terreno;
    
    public Casa(double mc, double precioMC2vivienda){
        super(mc);
        this.precioMC2vivienda = precioMC2vivienda;
        this.precioMC2terreno = (precioMC2vivienda*50/100);
    }
    
    public double getMCvivienda(){
       return this.precioMC2vivienda; 
    }
    
    public double getMCterreno(){
       return this.precioMC2terreno; 
    }
    
    @Override 
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Casa: "+df.format(precio());
    }
    
    @Override
    public double precio(){
        return getMCvivienda()*getMeCuadrado() + getMCterreno();
    }
}
