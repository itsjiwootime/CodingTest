import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int[][] arr = new int[200][200];
        int OFFSET = 100;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            for(int h = x1[i]+OFFSET; h < x2[i] + OFFSET; h++){
                for( int j = y1[i] + OFFSET; j < y2[i] + OFFSET; j++) {
                    arr[h][j]++;
                }
            }
        }
        // Please write your code here.

         int cnt = 0;

    for(int i = 0; i < 200; i++){
        for( int j = 0; j < 200; j++) {
                    if( arr[i][j] > 0){
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
    }

   

    
}