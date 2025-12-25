import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[1000001];
        int[] B = new int[1000001];

    
        int currentA = 1; 
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                A[currentA] = A[currentA - 1] + v;
                currentA++;
            }
        }


        int currentB = 1; 
        for (int i = 0; i < m; i++) { 
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                B[currentB] = B[currentB - 1] + v;
                currentB++;
            }
        }

        int totalTime = currentA - 1; 
        int count = 0;
        int leader = 0; 

        for (int i = 1; i <= totalTime; i++) {
            if (A[i] > B[i]) {
                if (leader == 2) { 
                    count++;
                }
                leader = 1;
            } else if (B[i] > A[i]) {
                if (leader == 1) { 
                    count++;
                }
                leader = 2;
            }
   
        }

        System.out.println(count);
    }
}