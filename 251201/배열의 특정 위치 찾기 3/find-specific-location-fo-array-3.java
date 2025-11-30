import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int index = 0;

        for(int i = 0; i < 100; i++) {
             arr[i] = sc.nextInt();
            if(arr[i] == 0){
                index = i -1;
                break;
                
            }
           
        }

        int sum = arr[index] + arr[index-1] + arr[index -2];

       

        System.out.println(sum);
    }
}