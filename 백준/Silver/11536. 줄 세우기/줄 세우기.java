import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        int upCount = 0; 
        int downCount = 0; 

        for (int i = 0; i < n - 1; i++) {
            
            if (names[i].compareTo(names[i + 1]) < 0) {
                upCount++;
            } 
            else if (names[i].compareTo(names[i + 1]) > 0) {
                downCount++;
            }
        }

        if (upCount == n - 1) {
            System.out.println("INCREASING");
        } else if (downCount == n - 1) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
        
        sc.close();
    }
}