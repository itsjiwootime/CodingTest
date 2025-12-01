import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int x : arr) {
            if (x % 2 == 0) count++;
        }

        int[] evenArr = new int[count];

        int idx = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                evenArr[idx++] = x;
            }
        }

        for (int x : evenArr) {
            System.out.print(x + " ");
        }
    }
}
