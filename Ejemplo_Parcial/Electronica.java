
public class Electronica extends Productos
{
  public Electronica(double precio){
    super(precio);}
  
  public double getValor(){return precio-(precio*40)/100;}
}
