class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int i = 0;
        for (int num : arr) {
            answer += (double)num;
            i++;
        }
        return answer/i;
    }
}