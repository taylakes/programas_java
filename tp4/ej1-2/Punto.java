
public class Punto
{
    private double x,y;
    
    public Punto(){
        x = 0;
        y = 0;
    }
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(double x){this.x = x;}
    
    public void setY(double y){this.y = y;}
    
    public double getX(){return x;}
    
    public double getY(){return y;}
    
    public String toString(){
        return ("("+x+","+y+")");
    }
}
