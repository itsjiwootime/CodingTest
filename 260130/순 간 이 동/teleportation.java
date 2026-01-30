import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();


        int direct = Math.abs(A - B);

        int teleport1 = Math.abs(A - x) + Math.abs(B - y);

   
        int teleport2 = Math.abs(A - y) + Math.abs(B - x);

        int result = Math.min(direct, Math.min(teleport1, teleport2));

        System.out.println(result);
    }
}