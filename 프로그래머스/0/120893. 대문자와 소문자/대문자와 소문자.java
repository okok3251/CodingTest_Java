class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char c: my_string.toCharArray()){
            int a = c;
            if(a < 97){
                answer += (char) (a + 32);
            }else{
                answer += (char) (a - 32);
            }
        }
        return answer;
    }
    
}