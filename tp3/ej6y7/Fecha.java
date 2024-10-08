
public class Fecha
{
     int año, mes, dia;
     
     public Fecha (String cadena){
            String d = cadena.substring(0,2);
            String m = cadena.substring(3,5);
            String a = cadena.substring(6,10);
            setAño(Integer.valueOf(a));
            setMes(Integer.valueOf(m));
            setDia(Integer.valueOf(d));
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

     public String incrementarDia(){ //punto 5
         switch (dia){
            case 28:{
                if (esBisiesto(año) || mes != 2){setDia(dia + 1);}
                else if(mes == 2){setDia(dia = 1); setMes(mes = 3);}
            }
            break;
            case 29:{
                if (esBisiesto(año) && mes == 2){setDia(dia = 1);setMes(mes = 3);}
                else {setDia(dia + 1);}
            }
            break;
            case 30:{
                if (mes == 4 || mes == 6 || mes == 9|| mes == 11){setDia(dia = 1); setMes(mes + 1);}
                else {setDia(dia + 1);}
            }
            break;
            case 31:{
                if (mes == 12){setDia(dia = 1); setMes(mes = 1); setAño(año + 1);}
                else {setDia(dia = 1); setMes(mes + 1);}
            }
            break;
            }
         return "Dia = "+dia+ "\nMes = " +mes+ "\nAño = " +año;
        }
        
     private static boolean esBisiesto(int año){return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));}
}
