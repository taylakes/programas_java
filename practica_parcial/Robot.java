
public class Robot
{
   private String numero;
   private int porcentaje;
   public static final int LIMSUP = 100;
   public static final int LIMINF = 0;
   
   public Robot(String numero, int porcentaje){
       this.numero = numero;
       this.porcentaje = porcentaje;
   }
   
   public int getPorcentaje(){
       return this.porcentaje;
   }
   
   public String getNumero(){
       return this.numero;
   }
   
   @Override
   public String toString(){
        return "Robot numero: " +getNumero() + ", porcentaje: " +getPorcentaje() + "%";
   }
}
