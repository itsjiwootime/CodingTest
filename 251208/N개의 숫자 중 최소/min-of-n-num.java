import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        int max = arr[0];

        for(int i = 1; i < N; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int minCnt = 0;
        int maxCnt = 0;


         for(int i = 0; i < N; i++) {
            if(arr[i] == min){
                minCnt++;
            }

            if(arr[i] == max) {
                maxCnt++;
            }
        }

        System.out.println(min + " "  + minCnt);
    }
}