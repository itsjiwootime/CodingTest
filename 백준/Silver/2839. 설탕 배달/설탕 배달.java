import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                return;
            }

            n -= 3;      // 5kg 봉지가 안 맞으면 3kg 봉지 하나 사용
            count++;     // 3kg 하나 추가
        }

        System.out.println(-1);
    }
}