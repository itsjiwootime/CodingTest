import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] count = new int[10];

        while( A > 1) {

            int num = A % B;
            count[num]++;
            A /= B;
            


        }


        int sum = 0;

        for(int i = 0; i < 10; i++) {
            int num = count[i];
            sum += num * num;
        }

        System.out.println(sum);

    }
}