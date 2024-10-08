import java.text.DecimalFormat;

abstract class Figura
{
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Área: " + df.format(calcularArea()) + "\n Perímetro: " + df.format(calcularPerimetro());
    }
}
