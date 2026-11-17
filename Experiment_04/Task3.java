// Experiment 4 - Task 3: Max of Two Numbers
public class Task3 {
    static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Larger: " + maxOf(14, 9));
    }
}
