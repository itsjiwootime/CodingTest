class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1); 
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder temp = new StringBuilder();
            
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    temp.append(Character.toUpperCase(c)); 
                } else {
                    temp.append(Character.toLowerCase(c)); 
                }
            }
            
            answer.append(temp);
            if (i < words.length - 1) answer.append(" "); 
        }
        
        return answer.toString();
    }
}
