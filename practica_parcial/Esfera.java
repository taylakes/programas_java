
public class Esfera implements SolidoRevolucion //herencia
{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Esfera con radio " + radio + ", superficie: " + calculoSuperficie();
    }
}
