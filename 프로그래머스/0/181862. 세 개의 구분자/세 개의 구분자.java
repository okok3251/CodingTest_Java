import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<myStr.length(); i++){
            char c = myStr.charAt(i);
            if(c == 'a'){
                sb.append(" ");
            }
            else if(c == 'b'){
                sb.append(" ");
            }
            else if(c == 'c'){
                sb.append(" ");
            }else{
                sb.append(c);
            }
            
        }
        return !sb.toString().isBlank() ? sb.toString().trim().split("\\s+") : new String[]{"EMPTY"};
    }
}