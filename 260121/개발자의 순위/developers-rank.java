import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); 
        int N = sc.nextInt(); 


        int[][] ranks = new int[K][N + 1];

        for (int k = 0; k < K; k++) {
            for (int pos = 1; pos <= N; pos++) {
                int dev = sc.nextInt();
                ranks[k][dev] = pos;
            }
        }

        int count = 0;

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (a == b) continue;

                boolean alwaysHigher = true;

                for (int k = 0; k < K; k++) {
                    if (ranks[k][a] > ranks[k][b]) {
                        alwaysHigher = false;
                        break;
                    }
                }

                if (alwaysHigher) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
