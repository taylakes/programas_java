
public class EmpleadoSalarioFijo extends Empleado
{
    private static final double porc1 = 0.05;
    private static final double porc2 = 0.1;
    private static final int anio1 = 2;
    private static final int anio2 = 5;
    private double sueldoBasico;
    
    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sb){
        super(dni,nombre,apellido,anioIngreso);
        this.sueldoBasico = sb;
    }
    
    private double porcAdicional(){
        int ant = antiguedadAnios();
        double porc = 0;
        if (ant>anio2){porc = porc2;}
        else if(ant>=anio1){porc = porc1;}
        return porc;
    }
    
    @Override
    public double getSalario(){return sueldoBasico + sueldoBasico*porcAdicional();}
}

