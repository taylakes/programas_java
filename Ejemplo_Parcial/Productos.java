
public abstract class Productos implements Comparable<Productos>
{
    protected double precio;
    
    public Productos(double precio){
        this.precio = precio;
    }
    
    public abstract double getValor();
    
    public int compareTo(Productos a){return (int)(this.getValor() - a.getValor());}
}
