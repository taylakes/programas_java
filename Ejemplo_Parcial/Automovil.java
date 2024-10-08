
public class Automovil implements Comparable<Automovil>
{
   private String marca, modelo;
   private int anio;
   
   public Automovil(String marca, String modelo, int anio){
       this.marca = marca;
       this.modelo = modelo;
       this.anio = anio;
   }
   
   public int compareTo(Automovil otro){return marca.compareTo(otro.marca);}
   
   public String getModelo(){return modelo;}
   
   public int getAnio(){return anio;}
}
