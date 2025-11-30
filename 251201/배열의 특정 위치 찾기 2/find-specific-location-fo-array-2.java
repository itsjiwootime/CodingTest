import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int evenSum = 0;
        int oddSum = 0;

        for(int i =0; i < 10; i++) {

            arr[i] = sc.nextInt();
        }

        for(int i =0; i < 10; i++) {

            if( (i+1) % 2 ==0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            }
        }

        int answer = evenSum > oddSum ? evenSum - oddSum : oddSum - evenSum;

        System.out.println(answer);
    }
}