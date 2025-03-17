import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        int[][] memo = new int[numbers.length][];        
        memo[0] = new int[2];
        memo[0][0] = numbers[0];
        memo[0][1] = -numbers[0];
        
        for(int i=1; i<numbers.length; i++){
            int[] row = new int[pow(2,i+1)];
            memo[i] = row;
            int idx = 0;
            for(int j=0; j<memo[i-1].length; j++){
                memo[i][idx++] = memo[i-1][j] + numbers[i];
                memo[i][idx++] = memo[i-1][j] - numbers[i];
            }
        }
        
        for(int i=0; i < memo[memo.length-1].length; i++){
            if(memo[memo.length-1][i] == target) answer++;
        }
          
        return answer;
    }
    
    
    public static int pow(int num,int e){
        int sum = 1;
        for(int i=0; i<e; i++){
            sum *= num;
        }
        return sum;
    }
}