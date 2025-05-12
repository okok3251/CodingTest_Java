import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] chArr = my_string.toCharArray();
        while(s < e){
            char temp = chArr[s];
            chArr[s] = chArr[e];
            chArr[e] = temp;
            s++;
            e--;
        }
        return new String(chArr);
    }
}