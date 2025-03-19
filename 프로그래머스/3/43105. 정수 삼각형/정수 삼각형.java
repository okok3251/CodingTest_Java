import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] memo = new int[triangle.length][];
        memo[0] = new int[]{triangle[0][0]};
        for(int i=1; i<triangle.length; i++){
            int[] row = new int[i+1];
            memo[i] = row;
            for(int j=0; j<memo[i].length; j++){
                if(i == j){
                    memo[i][j] = triangle[i][j] + memo[i-1][j-1];
                }
                else if(j ==0){
                    memo[i][j] = triangle[i][j] + memo[i-1][j];
                }
                else{
                    memo[i][j] = triangle[i][j] + max(memo[i-1][j-1], memo[i-1][j]);
                }
            }
        }
        return max(memo[memo.length-1]);
    }
    
    public static int max(int... n){
        int max_v = n[0];
        for(int i=1; i<n.length; i++){
            if(max_v < n[i]) max_v = n[i];
        }
        return max_v;
    }

}