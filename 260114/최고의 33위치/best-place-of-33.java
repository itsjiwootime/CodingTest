import java.util.Scanner;

public class Best33Location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 입력 받기
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCoins = 0;

        // 2. 모든 가능한 3x3 격자 위치 탐색 (Brute Force)
        // 시작점 (i, j)는 n-3까지만 가능
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                int currentCoins = countCoins(grid, i, j);
                maxCoins = Math.max(maxCoins, currentCoins);
            }
        }

        // 3. 결과 출력
        System.out.println(maxCoins);
    }

    // 특정 위치 (row, col)을 좌상단으로 하는 3x3 영역의 동전 수를 세는 메서드
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