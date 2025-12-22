import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[200][200];
        int OFFSET = 100;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if(i  % 2 == 0){
                for(int h = x1 + OFFSET; h < x2 + OFFSET; h++){
                    for(int j = y1 + OFFSET; j < y2 + OFFSET; j++){
                        arr[h][j] = 0;
                    }
                }

            }else {
                for(int h = x1 + OFFSET; h < x2 + OFFSET; h++){
                    for(int j = y1 + OFFSET; j < y2 + OFFSET; j++){
                        arr[h][j] = 1;
                    }
                }

            }
        }

        int cnt = 0;


        for(int i = 0; i < 200; i++){
                    for(int j = 0; j < 200; j++){
                        if( arr[i][j] > 0){
                            cnt++;
                        }
                    }
                }

                System.out.println(cnt);

        // Please write your code here.
    }
}