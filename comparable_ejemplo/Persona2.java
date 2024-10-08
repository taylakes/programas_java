
public class Persona2 implements Identificable<Integer>
{
    private String nom, ap;
    private int dni;
    
    public Persona2(int dni, String nom, String ap){
        this.nom = nom;
        this.ap = ap;
        this.dni = dni;
    }
    
    public String nombreCompleto(){
        return this.nom+" "+this.ap;
    }
     
    @Override 
    public String toString(){
        return "Persona{"+"DNI:"+dni+", nombre:"+nom+", apellido:"+ap+"}";
    }
    
    @Override
    public Integer getId(){return dni;}
    
    @Override 
    public void setId(Integer x){this.dni = x;}
    
    @Override
    public boolean sameId(Integer anotherID){return this.dni == anotherID;}
}
