import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] count = new int[10];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        } 

        for(int i = 0; i < N; i++) {
            count[arr[i]]++;
        }

        for(int i = 1; i < 10; i++) {
            System.out.println(count[i]);
        }

    }
}