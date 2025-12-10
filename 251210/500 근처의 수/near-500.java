import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for( int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int MAX = 0;
        int MIN = 1000;


        for( int i = 0; i < 10; i++){
            if(arr[i] > 500){
                if( arr[i] < MIN){
                    MIN = arr[i];
                }
            } else {
                if( arr[i] > MAX){
                    MAX = arr[i];
                }
            }
        }

        System.out.println(MAX + " " + MIN);


    }
}