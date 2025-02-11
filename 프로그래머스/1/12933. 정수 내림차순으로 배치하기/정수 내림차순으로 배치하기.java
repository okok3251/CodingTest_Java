import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] s = String.valueOf(n).toCharArray();
        for(int i=0; i<s.length-1; i++){
            for(int j=0; j < s.length-i-1; j++){
                if(s[j] < s[j+1]){
                    char temp = s[j+1];
                    s[j+1] = s[j];
                    s[j] = temp;
                } 
            }
        }
        long dc = 1;
        for(int i=0; i<s.length; i++){
            answer += (s[s.length-i-1]-'0') * dc;
            dc *= 10;
        }
        System.out.println(Arrays.toString(s));
        
        return answer;
    }
    
}

