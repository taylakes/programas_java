
public class Main
{
    public static void main(String [] args){
        Time t= new Time().setHora(23).setMin(59).setSeg(59);
        System.out.println(t);
        t.tick();
        System.out.println(t);
        t.tick();
        System.out.println(t);
    }
}
