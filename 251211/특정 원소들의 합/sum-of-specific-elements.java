import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int val = sc.nextInt();
              if (i >= j) {
                sum += val;
            }
    
        }

     
    }

       System.out.println(sum);
}
}