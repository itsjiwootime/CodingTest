import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[1000000];
        int[] B = new int[1000000];
        
        int A_current = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();


            for( int j = 0; j < t; j++){
                A[A_current] = A[A_current - 1] + v;
                A_current++;
            }
        }

        
        int B_current = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();


            for( int j = 0; j < t; j++){
                B[B_current] = B[B_current - 1] + v;
                B_current++;
            }
        }

        
        int first = 0;
        int max = (A_current > B_current) ? A_current : B_current;
        int cnt = 0;

        for(int i = 1; i < max; i++){
            if(A[i] > B[i]){
                if(first != 1){
                    first = 1;
                    cnt++;
                }
            }else if(B[i] > A[i]){
                if(first != 2){
                    first = 2;
                    cnt++;
                }
            }else if (A[i] == B[i]){
                if(first != 3){
                    first = 3;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        
    }
}