import java.util.Scanner;

public class Main {
    // 0-indexed 기준으로 범위 체크
    public static boolean inRange(int x, int y, int N) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        // 1-based 입력을 0-based로 변환
        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        String D = sc.next();

     
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int dirNum = 0;
        if (D.equals("U")) dirNum = 0;
        else if (D.equals("R")) dirNum = 1;
        else if (D.equals("D")) dirNum = 2;
        else if (D.equals("L")) dirNum = 3;

        for (int i = 0; i < T; i++) {
            int nx = R + dx[dirNum];
            int ny = C + dy[dirNum];

    
            if (!inRange(nx, ny, N)) {
             
                dirNum = (dirNum + 2) % 4; 
            } else {
              
                R = nx;
                C = ny;
            }
        }


        System.out.println((R + 1) + " " + (C + 1));
    }
}