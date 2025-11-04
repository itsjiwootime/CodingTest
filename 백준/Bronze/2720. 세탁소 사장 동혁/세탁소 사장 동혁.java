import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine()); 

            int q = money / 25;  
            money %= 25;
            int d = money / 10;  
            money %= 10;
            int n = money / 5;   
            money %= 5;
            int p = money;       

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
