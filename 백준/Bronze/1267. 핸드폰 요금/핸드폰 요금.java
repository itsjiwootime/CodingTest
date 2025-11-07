import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] callTimes = new int[N];

        for (int i = 0; i < N; i++) {
            callTimes[i] = sc.nextInt(); 
        }

        int yPrice = 0; 
        int mPrice = 0; 

        for (int i = 0; i < N; i++) {
            int time = callTimes[i];
            yPrice += ((time / 30) + 1) * 10;

            mPrice += ((time / 60) + 1) * 15;
        }

        if (yPrice < mPrice) {
            System.out.println("Y " + yPrice);
        } else if (yPrice > mPrice) {
            System.out.println("M " + mPrice);
        } else {
            System.out.println("Y M " + yPrice);
        }

    }
}
