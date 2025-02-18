import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] splitedArr = split(s);
        int min_val = splitedArr[0];
        int max_val = splitedArr[0];
        for(int i=1; i<splitedArr.length; i++){
            if(min_val > splitedArr[i]) min_val = splitedArr[i];
            if(max_val < splitedArr[i]) max_val = splitedArr[i];
        }
        return String.format("%d %d",min_val,max_val);
    }
    
    public static int[] split(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            if(c == 32){
                count ++;
            }
        }
        int[] arr = new int[count+1];
        int idx = 0;
        String si = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != 32){
                si += c;
            }else{
                arr[idx] = Integer.parseInt(si);
                si = "";
                idx++;
            }
            
        }
        if(si!=""){
            arr[idx] = Integer.parseInt(si);
        }
        
        System.out.println(Arrays.toString(arr));

        return arr;
    }
}
