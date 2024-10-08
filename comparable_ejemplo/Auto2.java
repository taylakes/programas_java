
public class Auto2 implements Identificable<String>
{
    private String patente, color;
    
    public Auto2(String patente, String color){
        this.patente = patente;
        this.color = color;
    }
    
    public String toString(){
        return "Auto{patente:"+this.patente+", color:"+this.color+"}";
    }
    
    @Override
    public String getId(){return patente;}
    
    @Override 
    public void setId(String x){this.patente = x;}
    
    @Override
    public boolean sameId(String anotherID){return this.patente == anotherID;}
}
