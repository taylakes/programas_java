import java.util.ArrayList;

public class Test
{
    public static void main(String [] args){
        ArrayList<SolidoRevolucion> solidos = new ArrayList<>();
        
        solidos.add(new Esfera(5));
        solidos.add(new Cilindro(3, 7));
        solidos.add(new Cono(4, 6));
        
        double superficieTotal = 0;
        for (SolidoRevolucion solido : solidos) {
            superficieTotal += solido.calculoSuperficie();//polimorfismo
        }

        System.out.println("La superficie total de todos los sólidos es: " + superficieTotal);
        mostrarLista(solidos);
    }
    
    public static void mostrarLista(ArrayList<SolidoRevolucion>lista){
        for(SolidoRevolucion solido:lista){
            System.out.println(solido);
        }
    }
}
