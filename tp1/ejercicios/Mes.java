
/**
 * Write a description of class Mes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mes
{
    private int x;
    
    public String Mes(int mes)
    {
        String nombre;
        switch (mes)
        {
            case 1: nombre ="Enero";
            break;
            case 2: nombre ="Febrero";
            break;
            case 3: nombre ="Marzo";
            break;
            case 4: nombre ="Abril";
            break;
            case 5: nombre ="Mayo";
            break;
            case 6: nombre ="Junio";
            break;
            case 7: nombre ="Julio";
            break;
            case 8: nombre ="Agosto";
            break;
            case 9: nombre ="Septiembre";
            break;
            case 10: nombre ="Octubre";
            break;
            case 11: nombre ="Noviembre";
            break;
            case 12: nombre ="Diciembre";
            break;
            default: nombre = "Numero invalido";
        }
        return nombre;
    }
}
