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

        int max = Integer.MIN_VALUE;
int max2 = Integer.MIN_VALUE;


        for(int i = 0; i < N; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i < N; i++) {
            if(arr[i] == max){
                continue;
            }
            if(arr[i] > max2){
                max2 = arr[i];
            }
        }

        System.out.println(max+" "+max2);




    }
}