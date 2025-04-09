class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<11; i++){
            int compare = factorial(answer);
            if(compare > n) break;
            answer++;
        }
        return answer-1;
    }
    
    public static int factorial(int m){
        int result = 1;
        while(m > 0){
            result *= m;
            m--;
        }
        return result;
    }
}