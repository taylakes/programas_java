
public class Auto
{
    private String patente, color;
    private int km;
    
    public Auto(String patente, String color, int km){
        this.patente = patente;
        this.color = color;
        this.km = km;
    }
    
    public String getPatente(){return patente;}
    
    public int getKmsRecorridos(){return km;}
    
    @Override
    public String toString(){return "Auto {"+"patente: "+this.patente+", color: "+this.color+", km: "+this.km+"}";}
}
