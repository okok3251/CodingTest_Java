class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<sqrt(n)+1; i++){
            if(i*i == n){
                answer += i;
                break;
            }
            if(n%i ==0){
                answer += i;
                answer += n/i;
            }
        }
        return answer;
    }
    
    public static int sqrt(int n) {
        int x = n;
        int y = (x + 1) / 2;

        while (y < x) {
            x = y;
            y = (x + n / x) / 2; 
        }
        return x;
    }
}