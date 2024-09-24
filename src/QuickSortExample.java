import java.util.Random;
import java.util.Arrays;

public class QuickSortExample {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high); 
            quickSort(array, low, pivotIndex - 1);  
            quickSort(array, pivotIndex + 1, high);  
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];  
        int i = low - 1;  

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {  
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;  
    }

    public static void sortRandomArray() {
        Random random = new Random();
        int size = 10;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); 
        }

        System.out.println("Array before sorting: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
