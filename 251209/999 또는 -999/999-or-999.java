import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  
        final int MAX_SIZE = 100;
        int[] numbers = new int[MAX_SIZE];
        
        Scanner scanner = new Scanner(System.in);
        

        int count = 0; 
        

        while (scanner.hasNextInt() && count < MAX_SIZE) {
            int num = scanner.nextInt();
       if (num == 999 || num == -999) {
                break;
            }

            numbers[count] = num;
            count++;
        }

        scanner.close();


        int maxVal = numbers[0];
        int minVal = numbers[0];
        
        for (int i = 1; i < count; i++) {
            int current = numbers[i];
            
            if (current > maxVal) {
                maxVal = current;
            }
            
    
            if (current < minVal) {
                minVal = current;
            }
        }

        System.out.println(maxVal + " " + minVal);
    
    
}
}