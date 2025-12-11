import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] yoil = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        // m1/d1 의 절대 날짜 (연초부터)
        int day1 = d1;
        for(int i=1; i<m1; i++){
            day1 += month[i];
        }

        // m2/d2 의 절대 날짜
        int day2 = d2;
        for(int i=1; i<m2; i++){
            day2 += month[i];
        }

        // 차이 (방향 포함)
        int diff = day2 - day1;

        // 요일 index (음수 보정)
        int index = (diff % 7 + 7) % 7;

        System.out.println(yoil[index]);
    }
}
