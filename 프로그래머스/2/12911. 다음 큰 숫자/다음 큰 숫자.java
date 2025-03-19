class Solution {
    public int solution(int n) {
        int answer = n+1;
        while(BinCount(n) != BinCount(answer)){
            answer++;
        }
        return answer;
    }
    
    public static int BinCount(int n){
        int count = 0;
        while(n >=1){
            if((n&1)==1) count++;
            n >>= 1;
        }
        return count;
    }
}