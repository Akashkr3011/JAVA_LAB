// Experiment 9 - Task 1: First Row and Last Row
public class Task1 {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("First row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + m[0][j]);
        }
        System.out.println();
        System.out.print("Last row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + m[2][j]);
        }
        System.out.println();
    }
}
