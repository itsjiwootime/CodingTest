import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 최대 1,000,000초까지 가능하므로 크기를 늘려줍니다.
        int[] posA = new int[1000001];
        int[] posB = new int[1000001];

        // A의 이동 기록
        int timeA = 1; // 1초부터 기록 시작
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                // 이전 초의 위치에서 +1 또는 -1
                posA[timeA] = posA[timeA - 1] + (d == 'R' ? 1 : -1);
                timeA++;
            }
        }

        // B의 이동 기록
        int timeB = 1;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posB[timeB] = posB[timeB - 1] + (d == 'R' ? 1 : -1);
                timeB++;
            }
        }

        // 최초로 만나는 시간 찾기
        int answer = -1;
        // timeA와 timeB는 이동이 끝난 후의 총 시간이므로 둘 중 하나를 기준으로 반복
        for (int i = 1; i < timeA; i++) {
            if (posA[i] == posB[i]) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}