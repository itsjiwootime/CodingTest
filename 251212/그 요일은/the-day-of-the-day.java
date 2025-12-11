import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.

        int[] m_day = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        Map<String, Integer> map = new HashMap<>();
        map.put("Mon",0);
        map.put("Tue",1);
        map.put("Wed",2);
        map.put("Thu",3);
        map.put("Fri",4);
        map.put("Sat",5);
        map.put("Sun",6);

        int day1 = d1;
        for(int i = 1; i < m1; i++) {
            day1 += m_day[i];
        }

        int day2 = d2;
        for(int i = 1; i < m2; i++) {
            day2 += m_day[i];
        }

        

        int target = map.get(A);

        int cnt = 0;

        for(int i = day1; i < day2;i++){
            if(i% 7 == target){
                cnt++;
            }
        }

        System.out.println(cnt);




    }
}