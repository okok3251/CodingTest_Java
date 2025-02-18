import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] ascii = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            ascii[i] = c;
        }
        for(int i=0; i<ascii.length-1; i++){
            for(int j=0; j<ascii.length-i-1; j++){
                if(ascii[j] < ascii[j+1]){
                    int temp = ascii[j];
                    ascii[j] = ascii[j+1];
                    ascii[j+1] = temp;
                }
            }
        }
        for(int i=0; i<ascii.length; i++){
            char c = (char)ascii[i];
            answer += c;
        }
        return answer;
        }

    }