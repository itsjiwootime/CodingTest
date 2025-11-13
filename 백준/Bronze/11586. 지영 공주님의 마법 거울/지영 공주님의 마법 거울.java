import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine(); 

        String[] mirror = new String[N];
        for (int i = 0; i < N; i++) {
            mirror[i] = sc.nextLine();
        }

        int K = sc.nextInt();

        if (K == 1) {
            for (int i = 0; i < N; i++) {
                System.out.println(mirror[i]);
            }
        } 
        else if (K == 2) {
            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder(mirror[i]);
                System.out.println(sb.reverse().toString());
            }
        } 
        else if (K == 3) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.println(mirror[i]);
            }
        }
        
        sc.close();
    }
}
