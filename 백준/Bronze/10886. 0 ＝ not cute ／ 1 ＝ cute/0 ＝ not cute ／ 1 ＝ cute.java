import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cute = 0;
        int notCute = 0;

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if (str.equals("0")) {
                notCute++;
            }else {
                cute++;
            }
        }

        String answer = cute > notCute ? "Junhee is cute!" : "Junhee is not cute!";
        System.out.println(answer);

    }
}


