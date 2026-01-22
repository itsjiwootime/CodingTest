import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        HashMap<Integer, Integer> cntX = new HashMap<>();
        HashMap<Integer, Integer> cntY = new HashMap<>();

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            cntX.put(x[i], cntX.getOrDefault(x[i], 0) + 1);
            cntY.put(y[i], cntY.getOrDefault(y[i], 0) + 1);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long vx = cntX.get(x[i]) - 1; // 같은 x에 있는 다른 점 개수
            long vy = cntY.get(y[i]) - 1; // 같은 y에 있는 다른 점 개수
            ans += vx * vy;
        }

        System.out.println(ans);
    }
}
