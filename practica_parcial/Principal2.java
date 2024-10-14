
public class Principal2
{
   public static void main(String [] args){
        CarroCompras carrito = new CarroCompras();
        
        carrito.addProducto(new Electronica(5611));
        carrito.addProducto(new LineaBlanca(2000));
        carrito.addProducto(new Electrodomesticos(6250));
        
        System.out.println("Valor total de carro: "+carrito.getValorTotal());
        carrito.imprimeListado();
   }
}
