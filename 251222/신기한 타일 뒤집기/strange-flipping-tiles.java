import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int SIZE = 200000;
        int OFFSET = SIZE / 2;

        int[] arr = new int[SIZE];

        int pos = OFFSET;
        int min = pos;
        int max = pos;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            int dir = (d == 'R') ? 1 : -1;
            int color = (d == 'R') ? 1 : 0;

            // 현재 위치 포함 x칸을 덮어쓰기
            for (int k = 0; k < x; k++) {
                int cur = pos + dir * k;
                arr[cur] = color;

                min = Math.min(min, cur);
                max = Math.max(max, cur);
            }

            // 마지막으로 뒤집은 타일 위치에 서 있음
            pos = pos + dir * (x - 1);
        }

        int white = 0;
        int black = 0;

        for (int i = min; i <= max; i++) {
            if (arr[i] == 0) white++;
            else black++;
        }

        System.out.println(white + " " + black);
    }
}
