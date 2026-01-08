import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        // 초기값 설정
        if (n >= 1) arr[1] = 1;
        if (n >= 2) arr[2] = 1;

        // for문으로 값 채우기
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        // n번째 값 출력
        System.out.println(arr[n]);
    }
}
