import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.stdin);
        
        // 이동 횟수 N 입력
        int n = sc.nextInt();
        
        int curX = 0, curY = 0; // 현재 위치
        int elapsedTime = 0;    // 경과 시간 (초)

        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0); // 방향 (N, S, E, W)
            int dist = sc.nextInt();        // 이동 거리

            // 한 칸씩 이동하며 (0, 0)에 도달하는지 확인
            for (int j = 0; j < dist; j++) {
                elapsedTime++; // 1초 경과

                if (dir == 'N') curY++;
                else if (dir == 'S') curY--;
                else if (dir == 'E') curX++;
                else if (dir == 'W') curX--;

                // 이동 후 현재 위치가 시작점(0, 0)인지 확인
                if (curX == 0 && curY == 0) {
                    System.out.println(elapsedTime);
                    return; // 처음으로 돌아온 즉시 종료
                }
            }
        }

        // 모든 이동이 끝날 때까지 돌아오지 못한 경우
        System.out.println(-1);
    }
}
