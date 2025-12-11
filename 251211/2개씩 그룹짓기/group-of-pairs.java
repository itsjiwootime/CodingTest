import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.println(nums[(2*n)-1] + nums[0]);
        // Please write your code here.
    }
}