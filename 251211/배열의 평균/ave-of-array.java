import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        double[] rowSum = new double[2]; 
        double[] colSum = new double[4];
        double totalseum = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                int value = arr[i][j];

                rowSum[i] += value;

                colSum[j] += value;

                totalseum += value;
            }
        }

        System.out.printf("%.1f %.1f \n",(rowSum[0]/4.0) ,(rowSum[1]/4));

        System.out.printf("%.1f %.1f %.1f %.1f \n",(colSum[0]/2.0) ,(colSum[1]/2), colSum[2]/2, colSum[3]/2);

        System.out.print(totalseum / 8); 


    }
}