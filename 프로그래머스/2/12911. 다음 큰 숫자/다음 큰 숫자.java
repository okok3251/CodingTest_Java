class Solution {
    public int solution(int n) {
        int answer = n+1;
        while(BitCount(n) != BitCount(answer)){
            answer++;
        }
        return answer;
    }
    
    public static int BitCount(int n){
        int count = 0;
        while(n >=1){
            if((n&1)==1) count++;
            n >>= 1;
        }
        return count;
    }
}