import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] targets = new int[N];
        for (int i = 0; i < N; i++) {
            targets[i] = sc.nextInt();
        }

        int current = 0; 
        int m = 0;    
        

        for (int i = 0; i < N; i++) {
            m++;
            int next = targets[current]; 

            if (next == K) { 
                System.out.println(m);
                return;
            }

            current = next; 
        }

        System.out.println("-1");
    }
}