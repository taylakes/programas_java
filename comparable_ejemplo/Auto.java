
public class Auto
{
    private String patente;
    private int km;
    
    public Auto(String patente, int km){
        this.patente = patente;
        this.km = km;
    }
    
    public String getPatente(){return this.patente;}

    public int getKM(){return this.km;}    
    
    public String toString(){
        return "Auto{patente:"+patente+", km:"+km+"}";
    }
}
