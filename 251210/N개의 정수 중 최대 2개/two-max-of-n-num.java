import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        // 최댓값 찾기
        for(int i = 0; i < N; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // 최댓값 개수 세기
        int count = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == max) {
                count++;
            }
        }

        int max2 = Integer.MIN_VALUE;

        if(count >= 2) {
            // 최댓값이 2개 이상이면 max2는 max
            max2 = max;
        } else {
            // 최댓값 제외한 값 중에서 가장 큰 값 찾기
            for(int i = 0; i < N; i++) {
                if(arr[i] < max && arr[i] > max2) {
                    max2 = arr[i];
                }
            }
        }

        System.out.println(max + " " + max2);
    }
}
