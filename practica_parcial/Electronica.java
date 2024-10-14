
public class Electronica extends Producto
{
    public static final int porcentaje = 40;
    
    public Electronica(double precio){
        super(precio);
    }
    
    @Override
    public double getValor(){
        return precio-(precio*40/100);
    } 
    
    @Override
    public String toString() {
        return "Electronica: " +getValor();
    }
}
