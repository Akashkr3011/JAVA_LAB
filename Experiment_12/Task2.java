// Experiment 12 - Task 2: Insertion Sort Test 2
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {14, 3, 9, 21, 6};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
