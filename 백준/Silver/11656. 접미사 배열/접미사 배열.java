import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
        
        String[] suffixes = new String[n];
        
        for (int i = 0; i < n; i++) {
            suffixes[i] = s.substring(i);
        }
        
        Arrays.sort(suffixes);
        
        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
        
        sc.close();
    }
}