
public class ExamenEscrito extends Examen
{
   private static final int minNota = 0;//final es constante no se puede modificar
   private static final int maxNota = 10;// static: hay una sola copia de esta variable compartida por todas las instancias de la clase
   private static final int notaApr = 6;// Se puede acceder a una variable estática sin necesidad de crear una instancia de la clase.
   private static final int minDuracion = 90;
   private int duracion;
   private int nota;
    
   public ExamenEscrito(int duracion, int nota, String fecha){
       super(fecha);
       this.duracion = duracion;
       this.nota = nota;
   }
   
   @Override
   public boolean aprobo(){
       return (nota>= notaApr && duracion <= minDuracion);
   }
}
