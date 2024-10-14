import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String [] args){
        ArrayList<Robot> robots = new ArrayList<>();
        
        robots.add(new Robot("0001",(int) (Math.random() * (Robot.LIMSUP - Robot.LIMINF + 1) + Robot.LIMINF)));
        robots.add(new Robot("0050",(int) (Math.random() * (Robot.LIMSUP - Robot.LIMINF + 1) + Robot.LIMINF)));
        robots.add(new Robot("0621",(int) (Math.random() * (Robot.LIMSUP - Robot.LIMINF + 1) + Robot.LIMINF)));
        robots.add(new Robot("0031",(int) (Math.random() * (Robot.LIMSUP - Robot.LIMINF + 1) + Robot.LIMINF)));
        robots.add(new Robot("0121",(int) (Math.random() * (Robot.LIMSUP - Robot.LIMINF + 1) + Robot.LIMINF)));
        
        System.out.println("Orden por porcentaje de vida:");
        Collections.sort(robots, new Compara<>(Robot::getPorcentaje));
        mostrarLista(robots);
        System.out.println();
        
        int cant = 0;
        for (Robot r: robots){
            if (r.getPorcentaje()>50) {cant++;}
        }
        System.out.println("Robots con mas del 50% de vida: "+cant);
        System.out.println();
        
        System.out.println("Orden con mayor porcentaje de vida:");
        Collections.sort(robots, new ComparaRobot());
        for (int i = 0; i < 3 && i < robots.size(); i++) {
            System.out.println(robots.get(i));
        }
    }
    
    public static void mostrarLista(ArrayList<?> lista){
      for(Object x: lista){System.out.println(x);} 
    }
}
