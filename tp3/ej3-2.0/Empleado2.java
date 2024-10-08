

public class Empleado2
{
     private String nombre, apellido;
     private Fecha fecNac, fecCon;
     
     public Empleado2(String nombre, String apellido, String fecCon, String fecNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecCon = new Fecha(fecCon);
        this.fecNac = new Fecha(fecNac);
     }
     
    public String getNombre(){return nombre;}
    public void setNombre(int Nombre){this.nombre = nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}
    
    public Fecha getfecCon() {return fecCon;}
    public void setFechaCon(Fecha fecCon){this.fecCon =  fecCon;}

    public Fecha getfecNac(){return fecNac;}
    public void setFechaNa(Fecha fecNac){this.fecNac = fecNac;}
}
