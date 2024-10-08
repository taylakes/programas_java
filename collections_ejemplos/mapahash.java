import java.util.HashMap;

public class mapahash
{
     public static void main(String [] args){
        HashMap<String, Integer> diccionario = new HashMap<>();
         
        //Agregamos pares clave-valordiccionario.put("primero",1230);
        diccionario.put("segundo",340);
        diccionario.put("tercero",10);
        diccionario.put("cuarto",0);
        //obtenemos el segundo elemento
        Integer puntaje = diccionario.get("primero");
        //obtenemos y removemos una relación
        Integer valor = diccionario.remove("cuarto");
        //obtenemos la cantidad de relaciones
        int tamaño = diccionario.size();
        //verificamos si existe la clave "quinto"
        boolean existe = diccionario.containsKey("quinto"); 
        //limpiamos el diccionario
        diccionario.clear();
        //averiguamos si el diccionario está vacía
        boolean vacia = diccionario.isEmpty();
        
        // Itera sobre las claves y valores
        for (String nombre : diccionario.keySet()) {
         int edad = diccionario.get(nombre);
         System.out.println(nombre + " tiene " + edad + " años.");
        }
     }
}
