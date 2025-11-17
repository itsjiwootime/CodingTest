import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        boolean[] rowSafe = new boolean[N];
        boolean[] colSafe = new boolean[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    rowSafe[i] = true;
                    colSafe[j] = true;
                }
            }
        }

        int needRow = 0;
        int needCol = 0;

        for (int i = 0; i < N; i++) {
            if (!rowSafe[i]) needRow++;
        }

        for (int j = 0; j < M; j++) {
            if (!colSafe[j]) needCol++;
        }

        System.out.println(Math.max(needRow, needCol));
    }
}
