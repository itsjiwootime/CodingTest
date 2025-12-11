import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int i = 1;
        int j = 0;

        while(true) {
            if(j == (n/2)+1){
                break;
            }
            Arrays.sort(arr,1,i);

            System.out.print(arr[j] + " ");

            i += 2;
            j++;
        }
        
        // Please write your code here.
    }
}