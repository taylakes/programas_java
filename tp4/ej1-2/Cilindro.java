
public class Cilindro extends Circulo
{
    private double altura;
    
    public Cilindro(){altura = 1;}
    
    public Cilindro(double x, double y, double radio, double altura){
        super(x,y,radio);
        this.altura = altura;
    }
    
    public void setAltura(double altura){this.altura = altura;}
    public double getAltura(){return altura;}
    
    public double getVolumen(){return getArea()*altura;}
    
    public String toString(){return super.toString()+" altura:"+altura;}
}
