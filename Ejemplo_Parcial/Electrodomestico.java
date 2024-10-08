
public class Electrodomestico extends Productos
{
  public Electrodomestico(double precio){
    super(precio);}
  
  public double getValor(){return precio-(precio*60)/100;}
}
