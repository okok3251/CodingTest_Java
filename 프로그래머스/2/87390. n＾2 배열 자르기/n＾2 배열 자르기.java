import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        // 마지막 행, 마지막 열,
        int idx = 0;
        for(long i = left; i<right+1; i++){
            int b = (int)(i/n);
            int a = (int)(i%n);
            answer[idx++] = a > b ? a+1 : b+1;
        }
        return answer;
    }
    
}