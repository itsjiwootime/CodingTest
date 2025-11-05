import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] seq = new int[B];
        int idx = 0;

        for (int val = 1; idx < B; val++) {
            for (int cnt = 0; cnt < val && idx < B; cnt++) {
                seq[idx++] = val;
            }
        }

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += seq[i];
        }

        System.out.println(sum);
    }
}
