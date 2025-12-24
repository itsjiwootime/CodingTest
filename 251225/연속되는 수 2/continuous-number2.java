import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 1;
        int cnt = 0;
        // Please write your code here.

        for(int i = 0; i < n-1; i++) {


            if( arr[i] == arr[i+1]){
                cnt++;

                if( max < cnt){
                    max = cnt;
                }
            }else{
                cnt = 1;
            }
        }

        System.out.println(max);
    }
}