class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int idx = code-1;
        while(idx < cipher.length()){
            char c = cipher.charAt(idx);
            answer += c;
            idx += code;
        }
        return answer;
    }
}