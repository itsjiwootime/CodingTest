import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 배열의 크기, K: 찾고자 하는 인덱스
        int N = sc.nextInt();
        int K = sc.nextInt();

        long low = 1;
        long high = K; // B[K]는 K보다 클 수 없음
        long ans = 0;

        // 이분 탐색 시작
        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0;

            // mid보다 작거나 같은 숫자의 개수를 세는 과정
            for (int i = 1; i <= N; i++) {
                // i행에서 mid보다 작은 숫자의 개수는 mid/i개 (최대 N개)
                count += Math.min(mid / i, N);
            }

            if (count < K) {
                // 개수가 부족하면 더 큰 숫자를 탐색
                low = mid + 1;
            } else {
                // 개수가 K보다 크거나 같으면 일단 정답 후보로 저장하고 더 작은 숫자를 탐색
                ans = mid;
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}