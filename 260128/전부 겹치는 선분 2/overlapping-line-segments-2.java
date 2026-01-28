import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        int[] prefixMax = new int[n];
        int[] prefixMin = new int[n];

        prefixMax[0] = x1[0];
        prefixMin[0] = x2[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], x1[i]);
            prefixMin[i] = Math.min(prefixMin[i - 1], x2[i]);
        }

       
        int[] suffixMax = new int[n];
        int[] suffixMin = new int[n];

        suffixMax[n - 1] = x1[n - 1];
        suffixMin[n - 1] = x2[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], x1[i]);
            suffixMin[i] = Math.min(suffixMin[i + 1], x2[i]);
        }

        
        for (int i = 0; i < n; i++) {
            int maxStart, minEnd;

            if (i == 0) {
                maxStart = suffixMax[1];
                minEnd = suffixMin[1];
            } else if (i == n - 1) {
                maxStart = prefixMax[n - 2];
                minEnd = prefixMin[n - 2];
            } else {
                maxStart = Math.max(prefixMax[i - 1], suffixMax[i + 1]);
                minEnd = Math.min(prefixMin[i - 1], suffixMin[i + 1]);
            }

            if (maxStart <= minEnd) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
