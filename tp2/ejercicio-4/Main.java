import java.util.Scanner;
import java.util.Random;

public class Main
{   static int r1,r2;//r1 siendo numerador y r2 denominador 

    public static Fraccion pidevalores(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Desea ingresar valores?(ingrese 1 si es asi, 2 para random)");
       int pid = scanner.nextInt();
       if (pid == 1){
           System.out.println("Ingrese primer valor:");
           r1 = scanner.nextInt();
           System.out.println("Ingrese segundo valor:");
           r2 = scanner.nextInt();
       }else{
           Random random = new Random();
           r1 = random.ints(1, 25).findFirst().getAsInt();
           r2 = random.ints(1, 25).findFirst().getAsInt();
        }
       System.out.println(r1+"/"+r2);
       return new Fraccion(r1,r2);
    }
    
    public static void operacion(int menu, Fraccion fraccion1, Fraccion fraccion2){
      switch (menu){
        case 1:{fraccion1.sumar(fraccion2);break;}
        case 2:{fraccion1.resta(fraccion2);break;}
        case 3:{fraccion1.multiplicacion(fraccion2);break;}
        case 4:{fraccion1.division(fraccion2);break;}
        default:{System.out.println("Opción no válida.");break;}
        }
    }
    
    public static void main (String [] args){
       Scanner scanner = new Scanner(System.in);
       Fraccion fraccion1 = pidevalores(); 
       Fraccion fraccion2 = pidevalores();
       System.out.print("MENU\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n");
       int menu = scanner.nextInt();
       operacion(menu, fraccion1, fraccion2);
    }
}
