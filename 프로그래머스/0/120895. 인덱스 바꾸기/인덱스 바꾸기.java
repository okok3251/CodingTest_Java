import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] cl = my_string.toCharArray();
        char temp = cl[num1];
        cl[num1] = cl[num2];
        cl[num2] = temp;
     
        System.out.println(Arrays.toString(cl));
        for(char c : cl){
            answer += c;
        }
        return answer;
    }
}