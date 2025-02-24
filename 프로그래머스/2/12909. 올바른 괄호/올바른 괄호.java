import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if(s.charAt(0) == ')'){
            return false;
        }
        Character[] stack = new Character[s.length()];
        int idx = 0;
        
        for(int i=0; i<stack.length; i++){
            char c = s.charAt(i);
            if(c == '('){
                stack[idx++] = c;
            }else{
                if(idx == 0){
                    return false;
                }
                idx--;
            }
        }
        if(idx != 0){
            return false;
        }
        return answer;
    }
}