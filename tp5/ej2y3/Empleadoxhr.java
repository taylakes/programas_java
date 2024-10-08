
public class Empleadoxhr extends Empleado
{
    private int horas,extra;
    private double precioHora;

    public Empleadoxhr(String nom, String ap, int horas, int extra, double precioHora){
        super(nom,ap);
        this.precioHora = precioHora; 
        this.horas = horas;
        this.extra = extra;
    }
    
    public void setPrecioHora(double precio){this.precioHora = precio;}
    public double getPrecioHora(){return precioHora;}
    
    public void setHoras(int horas){this.horas = horas;}
    public int getHoras(){return horas;}
    
    public void setHorasEx(int extra){this.extra = extra;}
    public double getHorasEx(){return extra;}
    
    public double getSalario(){return horas*precioHora+(extra*precioHora);}

    @Override
    public String toString(){
        return "Empleado por hora:{"+getNombre()+" "+getApellido()+", salario:"+getSalario()+"}";}
}
