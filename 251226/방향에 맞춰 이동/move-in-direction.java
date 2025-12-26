import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,-1,0,1};

        int x = 0, y = 0;

        Map<String,Integer> dir = new HashMap<>();
        dir.put("W", 0);
        dir.put("S", 1);
        dir.put("E", 2); 
        dir.put("N", 3);

        for (int i = 0; i < n; i++) {
            String direction = sc.next();
            int distance = sc.nextInt();
            
            int d = dir.get(direction);

            x += dx[d] * distance;
            y += dy[d] * distance;
        }

        System.out.println(x + " " + y);
    }
}