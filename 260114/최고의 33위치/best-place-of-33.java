import java.util.Scanner;

public class Main {
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

        // 1. $3 \times 3$ 격자의 왼쪽 상단 모서리 (i, j)를 기준으로 탐색합니다.
        // i와 j는 n - 3까지만 이동해야 격자를 벗어나지 않습니다.
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                
                // 2. 현재 위치 (i, j)에서 $3 \times 3$ 범위 내 동전 개수를 셉니다.
                int currentSum = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        currentSum += grid[row][col];
                    }
                }

                // 3. 최댓값을 갱신합니다.
                if (currentSum > maxCoins) {
                    maxCoins = currentSum;
                }
            }
        }

        // 4. 최종 결과 출력
        System.out.println(maxCoins);
    }
}