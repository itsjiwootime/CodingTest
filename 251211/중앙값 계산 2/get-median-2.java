import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        int i = 0;     
        int printed = 0; 
        while (true) {

            if (printed == (n/2 + 1)) break;


            int[] temp = Arrays.copyOfRange(arr, 0, i + 1);

            Arrays.sort(temp);

            int mid = temp.length / 2;

            System.out.print(temp[mid] + " ");

            i += 2;
            printed++;
        }
        
        // Please write your code here.
    }
}