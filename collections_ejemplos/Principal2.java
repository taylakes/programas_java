
public class Principal2
{
    public static void main(String [] args){
        Consesionaria c = new Consesionaria("FakeCar");
        
        c.mostrarAutos();
        
        c.agregarAuto(new Auto("ABC123","Naranja",1003));
        c.agregarAuto(new Auto("ABC578","Rosa",4000));
        c.agregarAuto(new Auto("ABC185","Rojo",3500));

        c.mostrarAutos();
        System.out.println("Autos con mayor cant de kms recorridos: " + c.autosMasKmsRecorridos());
        System.out.println("Auto con menor cant de kms recorridos: " + c.autoMenosKmsRecorridos());

        Auto a = c.buscarAuto("ABC578");
        if (a == null){System.out.println("No se encontro.");}
        else{System.out.println("Se encontro: "+a);}
        
        //Auto b = c.buscarAuto("ABC158","Rojo");
        //if (b == null){System.out.println("No se encontro.");}
        //else{System.out.println("Se encontro: "+b);}
        
        //.clear();//limpia toda la lista
        //c.mostrarAutos();
        
        //String elemento = lista.remove(1); obtenemos y removemos el segundo elemento
        //int tamaño = lista.size(); cantidad de elementos
        //int posicion = lista.indexOf("Hola"); posicion de un elemento determinado
        //boolean vacia = lista.isEmpty(); si la lista está vacía
        //boolean contiene = lista.contains("algo");si la lista contiene el elemento "algo"
    }
}
