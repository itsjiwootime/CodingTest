import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int count = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    // 세 점이 일직선인지 확인
                    int area = x[i] * (y[j] - y[k])
                             + x[j] * (y[k] - y[i])
                             + x[k] * (y[i] - y[j]);

                    if (area != 0) {
                        count++; // 삼각형 가능
                    }
                }
            }
        }

        System.out.println(count);
    }
}
