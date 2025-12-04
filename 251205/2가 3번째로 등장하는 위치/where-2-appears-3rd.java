import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++ ) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int i = 0; i < N; i++) {
            if (arr[i] == 2){
                cnt++;
            }

            if(cnt == 3){
                System.out.println(i +1);
                break;
            }
        }
    }
}