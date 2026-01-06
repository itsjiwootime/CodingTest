import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count = 0;

        // 1. 여는 괄호 '('를 찾기 위한 첫 번째 반복문
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                
                // 2. 해당 '(' 뒤에 나오는 닫는 괄호 ')'를 찾기 위한 두 번째 반복문
                for (int j = i + 1; j < n; j++) {
                    if (str.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}