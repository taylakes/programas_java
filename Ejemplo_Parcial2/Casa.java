
public class Casa extends Inmueble
{
   private double metro2Terreno;
   private double porc = 50;
   
   public Casa(double preMeC2,double metro2Terreno){
       super(preMeC2);
       this.metro2Terreno = (preMeC2)*50/100;
       porc = 50;
   }

   public void setPorc(double p){this.porc = p;}
   public double getPorc(){return porc;}
   
   public void setValorTerreno(double te){this.metro2Terreno = te;}
   public double getValorTerreno(){return metro2Terreno;}
   
   @Override
   public double calculoAlquiler(){
       return (getMetro2()+metro2Terreno);
   }
}
