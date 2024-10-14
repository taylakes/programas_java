
public class Electrodomesticos extends Producto
{
    public static final int porcentaje = 60;
    
    public Electrodomesticos(double precio){
        super(precio);
    }
    
    @Override
    public double getValor(){
        return precio-(precio*40/100);
    } 
    
    @Override
    public String toString() {
        return "Electrodomesticos: " +getValor();
    }
}
