import java.util.Scanner;

public class FechaTiempo
{
    int an, me, di, ho, mi, se;
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año: ");
        int an = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int me = scanner.nextInt();

        System.out.print("Ingrese el día: ");
        int di = scanner.nextInt();

        System.out.print("Ingrese la hora: ");
        int ho = scanner.nextInt();

        System.out.print("Ingrese los minutos: ");
        int mi = scanner.nextInt();

        System.out.print("Ingrese los segundos: ");
        int se = scanner.nextInt();
        Tiempo tiempo = new Tiempo(ho, mi, se, an, me ,di);
        System.out.println(tiempo);
        
        for (int i = 0; i < 5; i++) {
            tiempo.tick();
            System.out.println(tiempo);
        }
    }
}
