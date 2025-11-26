import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][4];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < 4; j++){
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }

        int cnt = 0;
        for(int i = 0; i < N; i++){
            double sum = 0;
            for(int j = 0; j < 4; j++){
                
                sum += arr[i][j];
            }
            if(sum / 4 >= 60){
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}