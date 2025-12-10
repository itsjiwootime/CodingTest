import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][3];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(Character.toUpperCase(arr[i][j]) + " ");
            }
            System.out.println();
        }

    }
}