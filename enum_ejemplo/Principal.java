
public class Principal
{
   public static void main(String [] args){
       System.out.println(NivelEstudio.PRIMARIO.ordinal());//.ordinal devuelve int, la posisicion en la que esta
       System.out.println(NivelEstudio.PRIMARIO.toString());//muestra como cadena
       
       NivelEstudio[] niveles = NivelEstudio.values();//devuelve array
       for (int i = 0; i < niveles.length; i++){System.out.println((i+1)+") "+niveles[i]);}
       
       NivelEstudio.valueOf("PRIMARIO");//convierte cadena a nivel de estudios, la opcion debe estar dentro de los enumerados
   }
}
