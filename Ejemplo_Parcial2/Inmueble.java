
public abstract class Inmueble
{
    private double preMeC2;
    
    public Inmueble(double preMeC2){this.preMeC2 = preMeC2;}
    
    public void setMetro2(double m2){this.preMeC2 = m2;}
    public double getMetro2(){return preMeC2;}
    
    public abstract double calculoAlquiler();
}
