import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            arr[i] = num;
        }

        for(int i = 0; i < 10; i++) {
            if(arr[i] == 0){
                break;
            }

            sum += arr[i];
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.1f",sum,avg);

        

    }
}