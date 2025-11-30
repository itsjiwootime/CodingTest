import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];

        for(int i = 0; i < 10 ; i++) {
            str[i] = sc.next();
        }

        System.out.printf("%s %s %s",str[1],str[4],str[7]);
    }
}