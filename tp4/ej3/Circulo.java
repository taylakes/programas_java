
public class Circulo extends Figura
{
    private double radio;
    
    public Circulo(double radio){this.radio = radio;}
    
    public void setRadio(double radio){this.radio = radio;}
    public double getRadio(){return radio;}
    
    @Override
    public double calcularPerimetro(){return 2 * Math.PI * radio;}
    
    @Override
    public double calcularArea(){return Math.PI + Math.pow(radio,2);}
    
}
