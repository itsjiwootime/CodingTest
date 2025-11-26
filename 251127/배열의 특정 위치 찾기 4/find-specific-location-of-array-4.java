import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;

        for(int i =0;i < 10;i++){
            int num = sc.nextInt();

            if(num == 0){
                break;
            }

            arr[cnt] = num;
            cnt++;

        }

        int numCnt = 0;

        for(int i =0;i < cnt;i++){
            if(arr[i] % 2 ==0) {
                sum += arr[i];
                numCnt++;
            }

        }

        System.out.println(numCnt + " " + sum);
    }
}