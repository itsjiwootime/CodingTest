import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long diff = 0;
        long answer = 0;

        for (int i = 0; i < n - 1; i++) {
            diff += a[i] - b[i];
            answer += Math.abs(diff);
        }

        System.out.println(answer);
    }
}
