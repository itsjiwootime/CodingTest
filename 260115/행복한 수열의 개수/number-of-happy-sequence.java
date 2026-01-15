import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[][] grid;

    public static boolean isHappySequence(int[] seq) {
        if (m == 1) return true;

        int maxConsecutive = 1;
        int currentConsecutive = 1;

        for (int i = 1; i < n; i++) {
            if (seq[i] == seq[i - 1]) {
                currentConsecutive++;
            } else {
                currentConsecutive = 1;
            }
         
            if (currentConsecutive > maxConsecutive) {
                maxConsecutive = currentConsecutive;
            }
        }

        return maxConsecutive >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int totalHappyCount = 0;

        for (int i = 0; i < n; i++) {
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                row[j] = grid[i][j];
            }
            if (isHappySequence(row)) {
                totalHappyCount++;
            }
        }

        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            if (isHappySequence(col)) {
                totalHappyCount++;
            }
        }

        System.out.println(totalHappyCount);
    }
}