import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니 개수, M: 공을 넣는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니 배열 생성 (1번부터 N번까지 사용하기 위해 N+1 크기로 설정)
        int[] baskets = new int[N + 1];

        for (int count = 0; count < M; count++) {
            int i = sc.nextInt(); // 시작 바구니
            int j = sc.nextInt(); // 끝 바구니
            int k = sc.nextInt(); // 공 번호

            // i번 바구니부터 j번 바구니까지 k번 공을 넣음 (기존 공은 덮어씌워짐)
            for (int index = i; index <= j; index++) {
                baskets[index] = k;
            }
        }

        // 결과 출력 (1번 바구니부터 N번까지)
        for (int index = 1; index <= N; index++) {
            System.out.print(baskets[index] + " ");
        }
        
        sc.close();
    }
}