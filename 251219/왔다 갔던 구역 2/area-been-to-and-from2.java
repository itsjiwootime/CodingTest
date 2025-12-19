import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int OFFSET = 100000;
        int[] arr = new int[200001];

        int cur = OFFSET;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            int next = cur;

            if (dir == 'R') {
                next = cur + x;
                for (int j = cur; j < next; j++) {
                    arr[j]++;
                }
            } else {
                next = cur - x;
                for (int j = cur - 1; j >= next; j--) {
                    arr[j]++;
                }
            }

            cur = next;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) cnt++;
        }

        System.out.println(cnt);
    }
}
