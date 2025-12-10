import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int  N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int MinCkdl = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            for( int j = 0; j < N; j++) {
                int currentCkdl = arr[i] - arr[j];

                if( currentCkdl > 0 && currentCkdl < MinCkdl) {
                    MinCkdl = currentCkdl;
                }
            }
        }

        System.out.println(MinCkdl);


    }
}