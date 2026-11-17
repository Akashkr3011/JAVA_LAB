// Experiment 13 - Task 2: String Reversal
public class Task2 {
    public static void main(String[] args) {
        String word = "Java";
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }
}
