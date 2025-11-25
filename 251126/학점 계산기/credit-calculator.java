import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avg = 0;
        double sum = 0;

        int N = sc.nextInt();


        double[] arr = new double[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        for(int i = 0; i < N; i++) {
            sum += arr[i];
        }

        avg = sum / N;

System.out.printf("%.1f\n",avg);
        if(avg >= 4.0) {
            System.out.println("Perfect");
        }else if(avg >= 3.0) {
            System.out.println("Good");

        }else {
            System.out.println("Poor");
        }

        
        // Please write your code here.
    }
}