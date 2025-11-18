import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        int N = S.length();
        Set<String> subStrings = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
           
                String substring = S.substring(i, j);
                subStrings.add(substring);
            }
        }
        System.out.println(subStrings.size());
    }
}