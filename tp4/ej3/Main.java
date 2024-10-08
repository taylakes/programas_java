import java.util.Scanner;

public class Main 
{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU\n1.Circulo\n2.Rectangulo\n3.Triangulo");
        int op = scanner.nextInt();
        
        switch(op){
            case 1:{
                System.out.println("Ingrese radio:");
                double rad = scanner.nextDouble();
                Circulo circulo = new Circulo(rad);
                System.out.println(circulo.toString());
            }
            break;
            case 2:{
                System.out.println("Ingrese base:");
                double bas = scanner.nextDouble();
                System.out.println("Ingrese altura:");
                double alt = scanner.nextDouble();
                Rectangulo rectangulo = new Rectangulo(bas,alt);
                System.out.println(rectangulo.toString());
            }
            break;
            case 3:{
                System.out.println("Ingrese los 3 lados:");
                double l1 = scanner.nextInt();
                double l2 = scanner.nextInt();
                double l3 = scanner.nextInt();
                System.out.println("Ingrese base:");
                double bas = scanner.nextDouble();
                System.out.println("Ingrese altura:");
                double alt = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(l1,l2,l3,bas,alt);
                 System.out.println(triangulo.toString());
            }
            break;
        }
    }
}
