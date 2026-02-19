import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] trees = new Integer[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        
        // 1. 나무가 자라는 시간을 내림차순으로 정렬
        Arrays.sort(trees, Collections.reverseOrder());
        
        int maxDay = 0;
        
        // 2. 각 나무별로 '심는 날 + 자라는 시간' 계산
        for (int i = 0; i < n; i++) {
            // i번째 나무는 (i + 1)일째에 심게 됨
            // 나무가 다 자라는 날 = 심는 날(i + 1) + 자라는 시간(trees[i])
            int finishDay = (i + 1) + trees[i];
            
            // 그 중 가장 늦게 끝나는 날을 갱신
            maxDay = Math.max(maxDay, finishDay);
        }
        
        // 3. 마지막 나무가 다 자란 다음날 초대 (maxDay + 1)
        System.out.println(maxDay + 1);
    }
}