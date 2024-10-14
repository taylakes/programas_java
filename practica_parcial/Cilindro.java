
public class Cilindro implements SolidoRevolucion //herencia
{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calculoSuperficie() {
        return 2 * Math.PI * radio * (altura + radio);
    }

    @Override
    public String toString() {
        return "Cilindro con radio " + radio + " y altura " + altura + ", superficie: " + calculoSuperficie();
    }
}
