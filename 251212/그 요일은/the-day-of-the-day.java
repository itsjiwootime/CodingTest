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

        int[] mdays = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        Map<String, Integer> map = new HashMap<>();
        map.put("Mon",0);
        map.put("Tue",1);
        map.put("Wed",2);
        map.put("Thu",3);
        map.put("Fri",4);
        map.put("Sat",5);
        map.put("Sun",6);

        
        

         int start = d1;
        for (int i = 1; i < m1; i++) start += mdays[i];

        int end = d2;
        for (int i = 1; i < m2; i++) end += mdays[i];

        int diff = end - start;

        int count = 0;

        int target = map.get(A);

      

        for (int i = 0; i <= diff; i++) {
            int weekday = (i) % 7;
            if (weekday == target) count++;
        }

        System.out.println(count);




    }
}