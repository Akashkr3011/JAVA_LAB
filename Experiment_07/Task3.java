// Experiment 7 - Task 3: Halving loop O(log n)
public class Task3 {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;
        // Time complexity: O(log n)
        while (n > 1) {
            n = n / 2;
            steps++;
        }
        System.out.println("Halving steps: " + steps);
    }
}
