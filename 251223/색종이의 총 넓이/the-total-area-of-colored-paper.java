import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        int[][] arr = new int[200][200];

        int OFFSET = 100;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            for(int j = x[i]+ OFFSET; j < x[i] + 8 +OFFSET; j++) {
                for(int h = y[i] + OFFSET; h < y[i] + 8 + OFFSET; h++){
                    arr[j][h]++;
                }
            }
        }

        int cnt = 0;

        for(int j = 0; j < 200; j++) {
                for(int h =0; h < 200; h++){
                    if(arr[j][h] > 0){
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);


        // Please write your code here.
    }
}