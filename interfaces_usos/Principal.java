
public class Principal
{
    public static void main(String [] args){
        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();
        
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new Persona());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        
        p.hacerCampaña();
    }
}
