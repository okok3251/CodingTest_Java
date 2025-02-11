import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String chat = "";
        for(int i=0; i<pat.length(); i++){
            char c = pat.charAt(i);
            if(c == 'A'){
                chat += 'B';
            }else{
                chat += 'A';
            }
        }
        for(int j=0; j<myString.length()+1 - pat.length(); j++){
            if(chat.equals(subString(myString,j,pat.length()+j))){
                answer = 1;
            }
            
        }
        return answer;
    }
    public static String subString(String s, int st, int ed){
        String result = "";
        for(int i=st; i<ed; i++){
            result += s.charAt(i);
        }
        return result;
    }
    
    // public int solution(String myString, String pat) {
    //     return myString.replace("A", "b").replace("B", "A").replace("b", "B").contains(pat) ? 1:0;
    // }
}