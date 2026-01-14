import java.util.Scanner;

public class Best33Location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCoins = 0;

 
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                int currentCoins = countCoins(grid, i, j);
                maxCoins = Math.max(maxCoins, currentCoins);
            }
        }

 
        System.out.println(maxCoins);
    }


    private static int countCoins(int[][] grid, int row, int col) {
        int count = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                count += grid[i][j];
            }
        }
        return count;
    }
}