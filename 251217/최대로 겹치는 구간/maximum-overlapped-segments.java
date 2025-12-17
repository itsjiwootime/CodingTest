import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int[] arr = new int[201];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            for(int j = x1[i]; j < x2[i]; j++){
                arr[j+100]++;
            }
        }

        int max = 0;

        for(int i = 0; i < arr.lenth(); i++) {
            if ( max < arr[i]) {
                max = arr[i];
            }

        }

        System.out.println(max);
        // Please write your code here.
    }
}