import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < Q; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = 0;
            if( num1 == 3){
                num3 = sc.nextInt();
            }

            switch(num1) {
                case 1:
                    int cnt = 0;
                    for(int j = 0; j < N; j++){
                        if(arr[j] == num2){
                            cnt = j;
                        }

                    }
                    System.out.println(cnt+1);
                    break;
                case 2:
                    int idx = -1;
                    for( int j = 0; j < N; j++) {
                        if(arr[j] == num2) {
                            idx = j;
                            break;
                        }

                    }
                    if( idx != -1){
                        System.out.println(idx+1);
                    } else{
                        System.out.println(0);
                    }
                    break;
                case 3:
                    for(int j = num2-1; j < num3; j++){
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    break;



            }
        }
    }
}