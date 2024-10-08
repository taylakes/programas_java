

public class Persona implements Comparable<Persona>
{
    String apellido;
    int edad;
    
    public Persona(String apellido,int edad)
    { this.apellido=apellido;
        this.edad=edad;
    }
    
    public int compareTo(Persona p)
    { return this.apellido.compareTo(p.apellido); 
    }
    /*public int compareTo(Object o)
    { Persona p=(Persona)o;
        return this.apellido.compareTo(p.apellido);
    }*/
    @Override
    public String toString()
    { return apellido+":"+Integer.toString(this.edad);
    }
    
    public int getEdad()
    { return edad;
    }
}
