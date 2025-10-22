class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a){
            answer += (n/a) * b;
            n = (n%a) + (n/a)*b;
            
            if(n<a){
                
                break;
            }
            System.out.println("cola의 값은  "  + answer);

            System.out.println("n의 값은  "  + n);
        }
        System.out.println(answer);
        return answer;
    }
}