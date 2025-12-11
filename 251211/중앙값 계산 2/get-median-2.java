import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int i = 1;
        int j = 0;

        int i = 0;       // 실제 읽은 개수 - 1 (0, 2, 4, ...)
        int printed = 0; // 몇 번 중앙값을 출력했는가

        while (true) {

            if (printed == (n/2 + 1)) break;

            // arr[0..i] 부분을 복사
            int[] temp = Arrays.copyOfRange(arr, 0, i + 1);

            // 정렬
            Arrays.sort(temp);

            // 중앙 인덱스
            int mid = temp.length / 2;

            System.out.print(temp[mid] + " ");

            // 다음 홀수 개수로 이동 (1 → 3 → 5 → …)
            i += 2;
            printed++;
        }
        
        // Please write your code here.
    }
}