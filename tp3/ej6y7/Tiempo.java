
public class Tiempo extends Fecha
{
   int h,m,s;
   
   public Tiempo (int h, int m, int s, int año, int mes, int dia){
        super(año, mes, dia);
        if (h >= 0 && h < 24) this.h = h;
        if (m >= 0 && m < 60) this.m = m;
        if (s >= 0 && s < 60) this.s = s;
    }
    
   public Tiempo setHora(int h){
        if (h >= 0 && h < 24){this.h = h;}
        return this;
    }
    
   public Tiempo setMin(int m){
        if (m >= 0 && m < 60){this.m = m;}
        return this;
    }
    
   public Tiempo setSeg(int s){
        if (s >= 0 && s < 60){this.s = s;}
        return this;
    }
   
   @Override
   public String toString(){return h+":"+m+":"+s;}
   
   public void tick(){
     s++;
     if (s == 60){
         m++; s= 0;
         if (m == 60){
            h++; m = 0;
            if (h == 24){
                h = 0;
                incrementarDia();
            }
            }
        }
    }
}
