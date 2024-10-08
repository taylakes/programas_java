
public class Circulo 
{
    private Punto punto;
    private double radio;
    
    public Circulo(){radio = 1;}
    
    public Circulo(double x, double y, double radio){
        this.punto = new Punto(x,y);
        this.radio = radio;
    }
    
    public Circulo(Punto punto, double radio){//sobrecargo el constructor
        this.punto = punto;
        this.radio = radio;
    }
    
    public void setRadio(double radio){this.radio = radio;}
    public double getRadio(){return radio;}
    
    public double getArea(){return Math.PI + Math.pow(radio,2);}
    
    public String toString(){return super.toString()+" radio:"+radio;}
}
