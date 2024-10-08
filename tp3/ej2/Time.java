
public class Time
{
   int h,m,s;
   
   public Time(){}
   
   public Time (int h, int m, int s){//no se necesita el this si las variables son distintas
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
   public Time setHora(int h){
        this.h = h;
        return this;
    }
    
   public Time setMin(int m){
        this.m = m;
        return this;
    }
    
   public Time setSeg(int s){
        this.s = s;
        return this;
    }
    
   public String toString(){return h+":"+m+":"+s;}
   
   public void tick(){//punto 4
    s++;
    if(s==60){
        m++;s=0;
        if (m==60){h++;m=0;
         if (h==24){h=0;}}
    }
    }
}
