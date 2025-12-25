import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[1000001];
        int[] B = new int[1000001];
        
        int currentA = 1;
        int mid_A = 50000000;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            if( d == 'L'){
                for(int j = 0; j < t; j++){
                    A[currentA] = mid_A - 1;
                    currentA++;
                    mid_A--;
                }
            } else{
                for(int j = 0; j < t; j++){
                    A[currentA] = mid_A + 1;
                    currentA++;
                    mid_A++;
                }
            }
        }


        int currentB = 1;
        int mid_B = 50000000;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            if( d == 'L'){
                for(int j = 0; j < t; j++){
                    B[currentB] = mid_B - 1;
                    currentB++;
                    mid_B--;
                }
            } else{
                for(int j = 0; j < t; j++){
                    B[currentB] = mid_B + 1;
                    currentB++;
                    mid_B++;
                }
            }
        }

        int cnt = 0;

        for(int i = 2; i < 1000001; i++){
            if( A[i] == B[i] ){
                if( A[i-1] != B[i-1]){
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
        // Please write your code here.
    }
}