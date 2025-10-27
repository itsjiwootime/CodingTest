class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0; 

        for (int i = 1; i <= number; i++) {
            int count = getDivisorCount(i); 

            if (count > limit) {
                count = power;
            }

            
            answer += count;
        }

        return answer;
    }


    public int getDivisorCount(int n) {
        int cnt = 0;

        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) { 
                if (i * i == n) cnt++; 
                else cnt += 2; 
            }
        }

        return cnt;
    }
}
