
public abstract class Producto implements Comparable<Producto>
{
    protected double precio;
    
    public Producto(double precio){
        this.precio = precio;
    }
    
    public abstract String toString();
    
    public abstract double getValor();
    
    public int compareTo(Producto a){return (int)(this.getValor() - a.getValor());}
}
