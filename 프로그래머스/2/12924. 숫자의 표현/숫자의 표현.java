class Solution {
    public int solution(int n) {
        int count = 0;
        int idx = 1;
        while(idx <= n){
            int sum = 0;
            for(int i=idx; i<n+1; i++){
                sum += i;
                if(sum == n) {
                    count++;
                    break;
            }
                if(sum > n){
                    break;
                }
        }
            idx++;
        
    }
        return count;
    }
}