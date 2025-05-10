import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i < myString.length() -pat.length()+1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i + pat.length(); j++){
                sb.append(myString.charAt(j));
            }
            
            if(pat.equals(sb.toString())){
                answer++;
            }
            sb.setLength(0);
        }
        return answer;
    }
}