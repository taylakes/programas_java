
public enum Continente
{
    AMERICA(516454,33332.2), //para agregar metodos se debe asignar los valores
    AFRICA(2576984,364.54),
    ASIA(143972,98672.2), 
    ANTARTIDA(10368,7724.6), 
    EUROPA(557932,9867.6), 
    OCEANIA(53605,679412.5);

    private int cantHabitantes;
    private double superficie;
    
    private Continente(int cantHabitantes, double superficie){
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }
    
    public double densidadPoblacion(){return this.cantHabitantes/this.superficie;}
    
    @Override
    public String toString(){return "Continente:{"+"cantHabitantes:"+cantHabitantes+", superficie:"+superficie+"}";}
}
