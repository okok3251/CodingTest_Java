class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 1;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            if(c == 32){
                idx = 1;
                answer += (char)(c);
            }
            else if(idx % 2 ==1 && c > 96){
                answer += (char)(c-32);
                idx++;
            }else if(idx % 2 == 0 && c < 97){
                answer += (char)(c+32);
                idx++;
            }else{
                answer += (char)(c);
                idx++;
            }
        }
        return answer;
    }
}