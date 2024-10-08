
public class Fecha
{
     int año, mes, dia;
     
     public Fecha (String cadena){
        String [] partes = cadena.split("/");
        String sdia = partes[0].length() == 1?"0"+partes[0]:partes[0];
        String smes = partes[1].length() == 1?"0"+partes[1]:partes[1];
        String saño = partes[2];
        setAño(Integer.valueOf(saño));
        setMes(Integer.valueOf(smes));
        setDia(Integer.valueOf(sdia));
        }
     
     public Fecha(int año, int mes, int dia){
         setAño(año);
         setMes(mes);
         setDia(dia);
        }
     
     public void setDia(int dia){
         if (dia>0 && dia<32){this.dia = dia;}
         else this.dia = -1;
        }
        
     public void setMes(int mes){
         if (mes>0 && mes<13){this.mes = mes;}
         else this.mes = -1;
        }
        
     public void setAño(int año){
         if (año>0 && año<2200){this.año = año;}
         else this.año= -1;
        }
        
     public String toString(){
        return "Dia = "+dia+ "\nMes = " +mes+ "\nAño = " +año;
    }
}
