
public abstract class Empleado
{
    private String nombre, apellido;
    
    public Empleado(){}
    
    public Empleado(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){return nombre;}
    public void setNombre(int Nombre){this.nombre = nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}
    
    public abstract double getSalario();
}
