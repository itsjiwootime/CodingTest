import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        char str = sc.next().charAt(0);

        for(int i = 0; i < 6; i++) {
            char a = arr[i];
            if( a == str) {
                idx = i;
            }
        }

        if(idx == -1){
            System.out.println("None");
        }else{
             System.out.println(idx);
        }
    }
}