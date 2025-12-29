import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이동 횟수 N 입력
        int n = sc.nextInt();

        // 현재 위치 (x, y)와 경과 시간
        int x = 0, y = 0;
        int elapsedTime = 0;

        // 방향에 따른 좌표 변화량 설정 (W, S, N, E)
        // W: 서(-x), S: 남(-y), N: 북(+y), E: 동(+x)
        int[] dx = {-1, 0, 0, 1}; // W, S, N, E 순서
        int[] dy = {0, -1, 1, 0};
        String dirs = "WSNE";

        for (int i = 0; i < n; i++) {
            String dirStr = sc.next();
            int distance = sc.nextInt();

            // 현재 방향의 인덱스 찾기
            int dirIdx = dirs.indexOf(dirStr);

            // 한 칸씩 이동하며 (0,0) 체크
            for (int j = 0; j < distance; j++) {
                x += dx[dirIdx];
                y += dy[dirIdx];
                elapsedTime++;

                // 원점으로 돌아왔는지 확인
                if (x == 0 && y == 0) {
                    System.out.println(elapsedTime);
                    return; // 프로그램 종료
                }
            }
        }

        // 모든 이동 후에도 원점에 도달하지 못한 경우
        System.out.println(-1);
    }
}