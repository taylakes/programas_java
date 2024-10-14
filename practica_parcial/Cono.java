
public class Cono implements SolidoRevolucion //herencia
{
    private double radio;//ocultamiento de la informacion
    private double altura;

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calculoSuperficie() {
        return Math.PI * Math.pow(radio, 2) + Math.PI * radio * Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "Cono con radio " + radio + " y altura " + altura + ", superficie: " + calculoSuperficie();
    }
}
