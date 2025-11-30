import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int oddSum = 0;
        double sum = 0;

        for(int i = 0; i < 10; i++) {
            if ( (i+1) % 2 == 0){
                oddSum += arr[i];
            }

            if ( (i+1) % 3 ==0 ) {
                sum += arr[i];
            }

        }

        System.out.printf("%d %.1f", oddSum ,sum / 3);
        
    }
}