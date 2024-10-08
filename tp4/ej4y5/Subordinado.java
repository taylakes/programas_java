
public class Subordinado extends Empleado
{
    private static double porc;
    private int cantPiezas;
    private double valorPieza;

    public Subordinado(String nom, String ap, int cantPiezas, double valorPieza){
        super(nom,ap);
        this.cantPiezas = cantPiezas;
        this.valorPieza = valorPieza;
        porc = 0.5;
    }
    
    public int getCantPiezas(){return cantPiezas;}
    public void setCantPiezas(int cantPiezas){this.cantPiezas = cantPiezas;}
    
    public double getValorPieza(){return valorPieza;}
    public void setValorPieza(double valorPieza){this.valorPieza = valorPieza;}
    
    public double getSalario(){return (cantPiezas*valorPieza)*porc;}
}
