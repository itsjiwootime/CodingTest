import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        int N = sc.nextInt();
        int[] P = new int[N]; // 각 카드가 가야 할 플레이어 정보
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int[] S = new int[N]; // 셔플 규칙
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }

        // 2. 초기 카드 상태 설정 (0, 1, 2, ..., N-1)
        int[] cards = new int[N];
        int[] initial = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = i;
            initial[i] = i;
        }

        int count = 0;
        int[] nextCards = new int[N];

        while (true) {
            // 3. 현재 상태가 목표에 맞는지 확인
            if (isValid(cards, P, N)) {
                System.out.println(count);
                return;
            }

            // 4. 카드 섞기
            for (int i = 0; i < N; i++) {
                nextCards[S[i]] = cards[i];
            }
            // 배열 복사 (System.arraycopy가 효율적임)
            System.arraycopy(nextCards, 0, cards, 0, N);
            count++;

            // 5. 처음 상태로 되돌아왔는지 확인 (사이클 발생 시 종료)
            if (Arrays.equals(cards, initial)) {
                System.out.println("-1");
                return;
            }
        }
    }

    // 목표 플레이어에게 카드가 가는지 체크하는 함수
    private static boolean isValid(int[] cards, int[] P, int N) {
        for (int i = 0; i < N; i++) {
            // i번째 위치에 있는 카드 번호: cards[i]
            // 그 카드가 가야 할 플레이어: P[cards[i]]
            // 현재 i번째 위치를 받는 플레이어: i % 3
            if (P[cards[i]] != (i % 3)) {
                return false;
            }
        }
        return true;
    }
}