import java.util.Scanner;
public class vector
{
  public static void main (String [] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector:");
    int tamaño = scanner.nextInt();
    
    llena_vec vec = new llena_vec(tamaño);
    
    vec.ingresa_random();
    
    System.out.println("La suma de los valores es:"+vec.suma_valores());
  }
}
