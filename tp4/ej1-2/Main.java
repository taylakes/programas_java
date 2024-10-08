import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args){
         DecimalFormat df = new DecimalFormat("0.00");
         Scanner scanner = new Scanner(System.in);
         System.out.println("MENU:\n1.Cilindro\n2.Circulo");
         int op = scanner.nextInt();
         
         System.out.println("Ingrese coordenadas de un punto:");
         double x = scanner.nextDouble();
         double y = scanner.nextDouble();
         Punto p = new Punto(x,y);
         System.out.println("Ingrese radio:");
         double rad = scanner.nextDouble();
     
         switch (op){
             case 1:{
                 System.out.println("Ingrese altura:");
                 double alt = scanner.nextDouble();
                 Cilindro ci = new Cilindro(x,y,rad,alt);
                 System.out.println(ci);
                 System.out.println("Volumen del cilindro: "+df.format(ci.getVolumen()));
             }
             break;
             case 2:{
                 Circulo c = new Circulo (x,y,rad);
                 System.out.println(c);
                 System.out.println("Area del circulo: "+df.format(c.getArea()));
             }
             break;
         }
    }
}
