import java.util.ArrayList;

public class Alumno implements Aprobable
{
   private String dni, apellido, nombre;
   private ArrayList<Examen> examenes;
   
   public Alumno(String dni, String nombre, String apellido){
       this.dni = dni;
       this.nombre = nombre;
       this.apellido = apellido;
       this.examenes = new ArrayList<>();
   }
   
   public void agregarExamen(Examen e){this.examenes.add(e);}
   
   public String getNombre(){return this.nombre+" "+this.apellido;}
   
   @Override
   public boolean aprobo() {
    for (Examen examen : this.examenes) {
        if (examen.aprobo()) {
            return true; // Al menos un examen aprobado
        }
    }
    return false; // Ninguno aprobado
   }
}
