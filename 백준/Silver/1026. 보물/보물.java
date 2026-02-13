import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) B[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A); // A 오름차순

        // B의 인덱스를 값 기준 내림차순으로 정렬
        Integer[] idx = new Integer[N];
        for (int i = 0; i < N; i++) idx[i] = i;

        Arrays.sort(idx, (i, j) -> Integer.compare(B[j], B[i])); // B 큰 순

        long sum = 0;
        for (int k = 0; k < N; k++) {
            int i = idx[k];      // B가 큰 위치부터
            sum += (long) A[k] * B[i]; // A의 작은 값부터 곱해줌
        }

        System.out.println(sum);
    }
}
