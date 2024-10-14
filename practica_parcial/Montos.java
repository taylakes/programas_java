
/**
 Ejercicio 1. Realizar un programa en lenguaje Java que, para un monto entero dado, devuelva la 
 cantidad de billetes de 100, 50, 20, 10, 5 y monedas de 1 y 2 pesos.
    Ej: 1773
    17 billetes de 100
    1 billetes de 50
    1 billetes de 20
    1 billetes de 2
    1 monedas de 1
 */
public class Montos 
{
    public static void main (String [] args){
        int monto = 1773;
        int [] valores = {100, 50, 20, 10, 5, 2, 1};
        int [] cantidad = dividirMonto(monto, valores);
        imprimir(valores, cantidad);
    }
    
    public static int[] dividirMonto(int monto, int[] valores) {
        int[] cantidades = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            cantidades[i] = monto / valores[i];
            monto %= valores[i]; //calcular el resto de una división y asignar el resultado a la variable
        }
        return cantidades;
    }

     public static void imprimir(int[] valores, int[] cantidad) {
        for (int i = 0; i < valores.length; i++) {
            if (cantidad[i] > 0) {
                String tipo = (valores[i] >= 5) ? "billetes" : "monedas";
                System.out.println(cantidad[i] + " " + tipo + " de " + valores[i]);
            }
        }
    }
}
