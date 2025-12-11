import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(arr[0]+" ");

      
        for(int j = 1; j <= n/2; j++) {
            System.out.print(arr[j]+" ");
        }
        
        // Please write your code here.
    }
}