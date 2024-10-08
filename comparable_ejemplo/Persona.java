
public class Persona implements Comparable<Persona> //lo q esta entre <> es con lo que se compara
{
    private String nom, ap;
    private double altura;
    private int dni;
    private EstadoCivil estadoCivil;
    
    public Persona(int dni, String nom, String ap, double altura, EstadoCivil estadoCivil){
        this.nom = nom;
        this.ap = ap;
        this.altura = altura;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    
    public String nombreCompleto(){
        return this.nom+" "+this.ap;
    }
    
    public int getDni(){return this.dni;}
    
    public double getAltura(){return this.altura;}
    
    @Override 
    public String toString(){
        return "Persona{"+"DNI:"+dni+", nombre:"+nom+", apellido:"+ap+", altura:"+altura+", estado civil:"+estadoCivil;
    }
    
    @Override 
    public int compareTo(Persona otra){
        //si yo vengo antes que la otra, retorna negativo
        //si yo voy despues que la otra, retorna positivo
        //si somos iguales, retorna un cero
        
        //POR DNI
        //return this.dni - otra.getDni();//si son int se resta, este orden es de menor a mayor
        //return otra.getDni() - this.dni;//orden mayor a menor
        
        //POR APELLIDO
        //return this.ap.compareTo(otra.ap);// de A a Z
        //return otra.ap.compareTo(this.ap);// de Z a A
        
        //POR APELLIDO
        //return this.nom.compareTo(otra.nom);// de A a Z
        //return otra.nom.compareTo(this.nom);// de Z a A
        
        //POR ALTURA
        //int retorno = 0;// de menor a mayor
        //if (this.altura > otra.altura){retorno = 1;}
        //else if (this.altura < otra.altura){retorno = -1;}
        //return retorno;
        //int retorno = 0;// de mayor a menor
        //if (otra.altura > this.altura){retorno = 1;}
        //else if (otra.altura < this.altura){retorno = -1;}
        //return retorno;
        
        //POR ENUM
        //return this.estadoCivil.ordinal()- otra.estadoCivil.ordinal();//por orden del enum
        //return this.estadoCivil.name().compareTo(otra.estadoCivil.name()); //de A a Z
        return otra.estadoCivil.name().compareTo(this.estadoCivil.name()); //de z a A
    }
}
