// Experiment 7 - Task 2: Nested loops O(n^2)
public class Task2 {
    public static void main(String[] args) {
        int steps = 0;
        // Time complexity: O(n^2)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }
        System.out.println("Steps: " + steps);
    }
}
