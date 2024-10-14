
public class LineaBlanca extends Producto
{
    public static final int porcentaje = 35;
    
    public LineaBlanca(double precio){
        super(precio);
    }
    
    @Override
    public double getValor(){
        return precio-(precio*40/100);
    } 
    
    @Override
    public String toString() {
        return "Linea Blanca: " +getValor();
    }
}
