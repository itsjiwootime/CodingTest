import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        int[] student = new int[n];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
            if( penalizedPerson[i] == arr[penalizedPerson[i]-1]){
                arr[i=1]++;
            }

            if(arr[i-1] == k){
                System.out.println(arr[i-1]);
                break;
            }
        }

        
        // Please write your code here.
    }
}