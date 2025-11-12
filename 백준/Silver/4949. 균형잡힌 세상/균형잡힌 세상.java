import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();

            // 온점 하나만 있는 줄이면 입력 끝
            if (line.equals(".")) {
                break;
            }

            // 이 줄이 균형 잡혔는지 체크
            if (isBalanced(line)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.print(sb.toString());
    }

    // 스택을 이용해서 균형 잡힌 문자열인지 확인하는 함수
    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        boolean ok = true; // 중간에 틀리면 false로 바꿀 예정

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 1) 여는 괄호는 그냥 스택에 넣기
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            }
            // 2) 닫는 소괄호 ')'
            else if (ch == ')') {
                // 스택이 비어 있으면 짝이 없음
                if (stack.isEmpty() || stack.peek() != '(') {
                    ok = false;
                    break;
                }
                stack.pop(); // 짝 맞았으니까 꺼내기
            }
            // 3) 닫는 대괄호 ']'
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    ok = false;
                    break;
                }
                stack.pop();
            }
            // 4) 그 외의 문자들은 전부 무시(아무 것도 안 함)
        }

        // 중간에 틀렸거나, 스택에 뭔가 남아 있으면 균형 X
        if (!ok) return false;
        if (!stack.isEmpty()) return false;

        // 여기까지 왔으면 균형 맞음
        return true;
    }
}
