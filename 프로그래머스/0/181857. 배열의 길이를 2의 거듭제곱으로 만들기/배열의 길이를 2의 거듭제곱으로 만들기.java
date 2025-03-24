import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int idx = 1;
        if(len <= 1) return arr;
        while(pow(2,idx) < len){
            idx++;
        }
        int[] answer = new int[pow(2,idx)];
        System.out.println(Arrays.toString(answer));
        for(int i=0; i<len; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
    
    public static int pow(int n, int m){
        int result = 1;
        while(m > 0){
            result *= n;
            m--;
        }
        return result;
    }
}