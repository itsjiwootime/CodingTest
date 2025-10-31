import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int balance = 0;
            boolean check = true;

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == '(') {
                    balance++;
                } else {
                    balance--;
                }

                if (balance < 0) {
                    check = false;
                    break;
                }
            }

            if (check && balance == 0) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }

        System.out.print(sb);
    }
}
