import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[][] answer = new int[n][];
        for(int i = 1; i <= n; i++) {
            int[] row = new int[i];
            answer[i - 1] = row;
        }
        
      
        int direction = 0;
        int depth = 0 , width = 0, value = 1;
        for(int i=n; i>0; i--){
            if (direction == 0) {  
                while (depth < n && (depth < answer.length && width < answer[depth].length) && answer[depth][width] == 0) {
                answer[depth++][width] = value++;
                }

                depth--; width++; direction = 1; 
            }
            if(direction == 1){
                while(width < n && (depth < answer.length && width < answer[depth].length) && answer[depth][width] == 0){
                    answer[depth][width++] = value++;
                }
                width -= 2; depth-=1; direction =2;
            }
            if(direction == 2){
                while(depth >= 0 && (depth < answer.length && width < answer[depth].length) && answer[depth][width] == 0){
                    answer[depth--][width--] = value++;
                }
                depth+=2; width++; direction = 0;
            }
        }
        int count = 0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                count++;
            }
        }
        int[] result = new int[count];
        int idx = 0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                result[idx++] = answer[i][j];
            }
        }
        
        return result;
    }
}
