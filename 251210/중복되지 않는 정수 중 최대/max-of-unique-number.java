import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if( value ==1) {
                if( key > max){
                    max = key;
                }
            } 
        }
        if ( max == Integer.MIN_VALUE){
            System.out.println(-1);
        } else{
            System.out.println(max);
        }
        
    }
}