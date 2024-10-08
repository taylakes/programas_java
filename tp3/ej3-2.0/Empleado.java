
public class Empleado
{
    private String nombre, apellido, con, na;
    
    public Empleado(){}
    
    public Empleado(String nombre, String apellido, String con, String na){
        this.nombre = nombre;
        this.apellido = apellido;
        this.con = con;
        this.na = na;
    }
    
    public String getNombre(){return nombre;}
    public void setNombre(int Nombre){this.nombre = nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}
    
    public String getcon() {return con;}
    public void setFechaCon(String con){this.con = con;}

    public String getna(){return na;}
    public void setFechaNa(String na){this.na = na;}
}
