import java.util.Scanner;
public class Main {
    public static boolean inRange(int x, int y, int n){
        return ( 0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cntt = 0;

                for(int dirNum = 0; dirNum < 4; dirNum++){

                    int x = i + dx[dirNum];
                    int y = j + dy[dirNum];

                    if(inRange(x,y,n) && arr[x][y] == 1){
                        cntt++;
                    }
                }
            if( cntt >= 3){
                    cnt++;
                }
            }
            
        }

        System.out.println(cnt);


        
    }
}