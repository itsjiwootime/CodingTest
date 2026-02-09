import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] chunks = input.split("-");

        int totalSum = 0;

        for (int i = 0; i < chunks.length; i++) {
            int chunkSum = calculateSum(chunks[i]);

            if (i == 0) {
                totalSum += chunkSum;
            } else {
                totalSum -= chunkSum;
            }
        }

        System.out.println(totalSum);
    }

    private static int calculateSum(String chunk) {
        int sum = 0;
        String[] numbers = chunk.split("\\+");
        
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}