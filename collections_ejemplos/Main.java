
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Usando Arrays.fill() para completar un array con un valor
        int[] array = new int[10];
        Arrays.fill(array, 5);
        System.out.println("Array completado con fill(): " + Arrays.toString(array));

        // 2. Usando Arrays.sort() para ordenar el array
        int[] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6};
        Arrays.sort(unsortedArray);
        System.out.println("Array ordenado con sort(): " + Arrays.toString(unsortedArray));

        // 3. Usando binarySearch() para encontrar un elemento
        int[] sortedArray = {1, 1, 2, 3, 4, 5, 6, 9};
        int target = 5;
        int index = binarySearch(sortedArray, target);

        if (index != -1) {
            System.out.println("Elemento " + target + " encontrado en el índice: " + index);
        } else {
            System.out.println("Elemento " + target + " no encontrado");
        }
    }

    // Implementación de binarySearch()
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid; // Retorna la posición del elemento
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Retorna -1 si no se encuentra el elemento
    }
}
