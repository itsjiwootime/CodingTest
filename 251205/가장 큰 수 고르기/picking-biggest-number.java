import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {

            arr[i] = sc.nextInt();
        }

        int min = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++) {

            if( arr[i] > min){
                min = arr[i];
            }
        }
        
        System.out.println(min);
    }
}