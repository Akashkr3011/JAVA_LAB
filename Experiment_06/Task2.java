// Experiment 6 - Task 2: Smallest Value and Index
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};
        int min = arr[0];
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
            }
        }
        System.out.println("Smallest: " + min + " at index " + pos);
    }
}
