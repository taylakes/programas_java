
public class LineaBlanca extends Productos
{
  public LineaBlanca(double precio){
      super(precio);}
  
  public double getValor(){return precio-(precio*35)/100;}
}
