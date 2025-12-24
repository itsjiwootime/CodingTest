import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int cnt = -1;
        int[] student = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int qjfwja = sc.nextInt(); // 벌점 받은 학생 번호 입력

            student[qjfwja]++; // 해당 학생 벌점 추가

            if (student[qjfwja] == k) {
                // 수정된 부분: 벌점 개수가 아니라 '학생 번호'를 출력해야 함
                System.out.println(qjfwja); 
                cnt = 1; // 찾았다는 표시 (기존 cnt++도 무방합니다)
                break;
            }
        }

        // 끝까지 m번을 다 돌았는데도 k점에 도달한 사람이 없으면 -1 출력
        if (cnt == -1) {
            System.out.println(-1);
        }
    }
}