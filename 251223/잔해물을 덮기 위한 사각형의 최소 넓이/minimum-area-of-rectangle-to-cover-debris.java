import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();

        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();

        int[][] arr = new int[2000][2000];
        int OFFSET = 1000;

        // 첫 번째 직사각형 칠하기
        for (int i = rect1_x1 + OFFSET; i < rect1_x2 + OFFSET; i++) {
            for (int j = rect1_y1 + OFFSET; j < rect1_y2 + OFFSET; j++) {
                arr[i][j] = 1;
            }
        }

        // 두 번째 직사각형 지우기
        for (int i = rect2_x1 + OFFSET; i < rect2_x2 + OFFSET; i++) {
            for (int j = rect2_y1 + OFFSET; j < rect2_y2 + OFFSET; j++) {
                arr[i][j] = 0;
            }
        }

        int minX = 2001, maxX = -1;
        int minY = 2001, maxY = -1;

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (arr[i][j] == 1) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        // 남은 영역이 없는 경우
        if (maxX == -1) {
            System.out.println(0);
        } else {
            int area = (maxX - minX +1) * (maxY - minY +1 );
            System.out.println(area);
        }
    }
}