import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] num_of_days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int day = 0;

        while(true){
            if(m1 == m2 && d1 == d2){
                break;
            }

            day++;
            d1++;

            if(d1 > num_of_days[m1]){
                m1++;
                d1 =1;
            }
        }

        System.out.println(day);
    }
}