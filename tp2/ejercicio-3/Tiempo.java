
public class Tiempo
{
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(){ setTime(0,0,0);}
    
    public void setTime(int h, int m, int s)
    {
        hora =((h >= 0 && h < 24)? h:0);
        minuto =((m >= 0 && m < 60)? m:0);
        segundo =((s >= 0 && s < 60)? s:0);
    }
    
    public String toMilitaryString()
    {
      return ( hora < 10 ? "0" : "" ) + hora + ( minuto < 10 ? "0" : "" ) + minuto;
    }

    public String toString()
    {
      return ( ( hora == 12 || hora == 0 ) ? 12 : hora% 12 ) +
             ":" + ( minuto < 10 ? "0" : "" ) + minuto +
             ":" + ( segundo < 10 ? "0" : "" ) + segundo +
             ( hora < 12 ? " AM" : " PM" );
    }
}
