import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Hashtable<String,Integer> ht = new Hashtable<>();
        int i = 1;
        int j = 1;
        String lastWord = null;
        for(String word : words) {
            if(i>n){
                j++;
                i=1;
            }
            
            if (lastWord != null) {
        if (lastWord.charAt(lastWord.length() - 1) != word.charAt(0)) {
            answer[0] = i;
            answer[1] = j;
            break;
        }
    }
            
            if(ht.containsKey(word)) {
                
                answer[0]=i;
                answer[1]=j;
                break;
            }
            ht.put(word,i);
            i++;
            lastWord = word;
        }

        return answer;
    }
}