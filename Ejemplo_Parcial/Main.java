
public class Main
{
   public static void main(String [] args){
       CarroCompras carro = new CarroCompras(); 
       carro.addProducto(new Electrodomestico(300));
       carro.addProducto(new LineaBlanca(600));
       carro.addProducto(new Electronica(400));
       
       System.out.println("Valor total de carro: "+carro.getValorTotal());
       carro.imprimeListado();
    }
}
