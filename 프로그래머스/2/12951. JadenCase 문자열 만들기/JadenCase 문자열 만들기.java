class Solution {
    public String solution(String s) {
        String answer = "";
        Boolean isFirst = true;
        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i);
            if(a > 96 && isFirst == true){ // 소문자인데 첫번쨰 단어일 경우
                answer += (char)(a-32);
                isFirst = false;
                continue;
            }
            if(a == 32){ // 공백일 경우
                answer += " ";
                isFirst = true;
                continue;
            }
            if(a < 97 && isFirst == false){ // 대문자인데 첫번째 단어가 아닐 경우
                answer += (char)(a+32);
                continue;
            }
            answer += (char)(a); // 숫자인데 첫번째에 나오는 경우를 고려해야할듯.
            isFirst = false;
        }
        return answer;
    }
}