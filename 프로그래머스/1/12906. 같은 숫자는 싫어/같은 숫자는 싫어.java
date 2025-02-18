import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int state = -1;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == state){
                continue;
            }
            state = arr[i];
            count ++;
        }
        int[] answer = new int[count];
        int idx = 0;
        state = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == state){
                continue;
            }
            state = arr[i];
            answer[idx] = arr[i];
            idx ++;
        }
        
        

        return answer;
    }
}