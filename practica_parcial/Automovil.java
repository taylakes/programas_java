
public class Automovil
{
    private String marca;
    private String modelo;
    private int anio;
 
    public Automovil(String marca, String modelo, int anio){
         this.marca = marca;
         this.modelo = modelo;
         this.anio = anio;
    }
    
    public String getMarca(){return this.marca;}
    
    public String getModelo(){return this.modelo;}
    
    public int getAnio(){return this.anio;}
    
    public String toString(){
        return getMarca()+" - "+getModelo()+" - "+getAnio();
    }
}
