import java.util.ArrayList;

public class Main
{
    public static void main(String [] args){
        ArrayList<Inmueble> listaInmuebles = new ArrayList<>();

        listaInmuebles.add(new Casa(1000, 200));
        listaInmuebles.add(new Departamento(1500, 303.3));
        listaInmuebles.add(new Local(20564.31));

        for (Inmueble inmueble : listaInmuebles) {
            System.out.println(inmueble);
            System.out.println("Alquiler: " + inmueble.calculoAlquiler());
        }
    }
}

