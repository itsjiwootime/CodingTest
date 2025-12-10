import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for( int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int buyPrice = arr[0];

        int maxProfit = 0;

        for(int i = 1 ; i < N; i++) {
            int cur = arr[i];

            int curProfit = cur - buyPrice;

            if(curProfit > maxProfit) {
                maxProfit = curProfit;
            }

            if(cur < buyPrice) {
                buyPrice = cur;
            }

            
        }

        System.out.println(maxProfit);

    }
}