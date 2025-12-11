import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n+1];
        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);

        System.out.println(nums[k]);
    }
}