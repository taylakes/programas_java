import java.util.ArrayList;

public class Consesionaria
{
    private String nombre;
    private ArrayList<Auto> autos;
    
    public Consesionaria(String nombre){
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    
    public void agregarAuto(Auto a){this.autos.add(a);}
    
     public int cantAutos() {return autos.size();}
    
    public void mostrarAutos(){
        if (autos.isEmpty()){System.out.println ("No hay autos.");}
        else {for (int i = 0; i< autos.size(); i++){System.out.println(autos.get(i));}}
    }
    
    //public void mostrarAutos(){
    //    if (autos.isEmpty()){System.out.println ("No hay autos.");}
    //    else {for (Auto a:autos){System.out.println(a);}}
    //}
    
     public Auto autoMasKmsRecorridos() {
        Auto autoMax = null;
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                autoMax = auto;
            }
        }
        return autoMax;
    }

    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = -1;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            } else if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                listaDeMaximos.clear();
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }

    public Auto autoMenosKmsRecorridos() {
        Auto autoMin = null;
        int kmsMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() < kmsMin) {
                kmsMin = auto.getKmsRecorridos();
                autoMin = auto;
            }
        }
        return autoMin;
    }
    
    public Auto buscarAuto(String patente){
        Auto autoEncontrado = null;// asigna null a autoEncontrado
        int i = 0;
        while (i < cantAutos() && autoEncontrado == null){//compara
            Auto auto = this.autos.get(i);
            if (auto.getPatente().equalsIgnoreCase(patente)){autoEncontrado = auto;}//equalsIgnoreCase no importa si es miniscula o mayuscula lo toma
            i++;
        }
        return autoEncontrado;
    }
}
