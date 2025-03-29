class Solution {
    // 기존의 3진법 체계는 유지하되, 숫자를 +1을 해줘야될듯
    // 2진법은 0,1
    // 3진법은 0,1,2
    // 124나라는 1,2,4로만 표현이 가능.
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        while(n > 0){
            int c = n%3;
            if(c == 0){
                answer.append((char)(52));
                n--; // 3의 경우에 3/3의 몫이 1이 되는데, --를 해줌으로써 방지
            }else{
                answer.append((char)(c+48));
            }
            
            n /= 3;
        }
        return answer.reverse().toString();
        
    }
}