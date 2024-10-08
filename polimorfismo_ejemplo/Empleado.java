import java.time.LocalDate;

public abstract class Empleado
{
    private String dni,nom,ape;
    private int anioIngreso;
    
    public Empleado(String dni, String nom, String ape, int anioIngreso){
        this.dni = dni;
        this.nom = nom;
        this.ape = ape;
        this.anioIngreso = anioIngreso;
    }
    
    public String getNomYApe(){return nom+" "+ape;}
    
    public int antiguedadAnios(){
        int anioActual = LocalDate.now().getYear();
        return (anioActual-anioIngreso);
    }
    
    public abstract double getSalario();
}
