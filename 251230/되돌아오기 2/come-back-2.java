import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String commands = br.readLine();

        // 현재 위치 (x, y)와 방향 (dir)
        int x = 0, y = 0;
        int dir = 0; // 0: 북, 1: 동, 2: 남, 3: 서

        // 방향 벡터: 북(0,1), 동(1,0), 남(0,-1), 서(-1,0)
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int elapsedTime = 0;
        boolean returned = false;

        for (int i = 0; i < commands.length(); i++) {
            char cmd = commands.charAt(i);
            elapsedTime++;

            if (cmd == 'L') {
                // 왼쪽으로 90도 회전
                dir = (dir + 3) % 4;
            } else if (cmd == 'R') {
                // 오른쪽으로 90도 회전
                dir = (dir + 1) % 4;
            } else if (cmd == 'F') {
                // 바라보는 방향으로 한 칸 이동
                x += dx[dir];
                y += dy[dir];
            }

            // (0, 0)으로 돌아왔는지 확인
            if (x == 0 && y == 0) {
                System.out.println(elapsedTime);
                returned = true;
                break;
            }
        }

        if (!returned) {
            System.out.println(-1);
        }
    }
}