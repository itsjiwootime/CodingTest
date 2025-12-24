import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int cnt = -1;

        int[] student = new int[n+1];
        for (int i = 0; i < m; i++) {
            int qjfwja = sc.nextInt();

            student[qjfwja]++;
            if(student[qjfwja] == k) {
                System.out.println(student[qjfwja]-1);
                cnt++;
                break;
            }
        }

        if(cnt == -1){
            System.out.println(-1);
        }
        

        
        // Please write your code here.
    }
}