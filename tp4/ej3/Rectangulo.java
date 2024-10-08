
public class Rectangulo extends Figura
{
    private double altura,base;
    
    public Rectangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }
    
    public void setAltura(double altura){this.altura = altura;}
    public double getAltura(){return altura;}
    
    public void setBase(double base){this.base = base;}
    public double getBase(){return base;}
    
    @Override
    public double calcularPerimetro(){return 2 * (base + altura);}
    
    @Override
    public double calcularArea(){return base * altura;}
    
}
