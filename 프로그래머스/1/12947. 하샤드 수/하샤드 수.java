class Solution {
    public boolean solution(int x) {
        int originalX = x; 
        int sumOfDigits = 0;
        int tempX = x;
        while (tempX > 0) {
            sumOfDigits += tempX % 10;
            tempX /= 10;
        }
        
    
        return (originalX % sumOfDigits == 0);
    }
}