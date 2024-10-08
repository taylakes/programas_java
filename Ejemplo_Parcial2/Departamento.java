
public class Departamento extends Inmueble
{
    private double expensas;
    
    public Departamento(double preMeC2,double expensas){
        super(preMeC2);
        this.expensas = expensas;
    }
    
    public void setExpensas(double exp){this.expensas = exp;}
    public double getExpensas(){return expensas;}
    
    @Override
    public double calculoAlquiler(){return (getMetro2()+expensas);}
}
