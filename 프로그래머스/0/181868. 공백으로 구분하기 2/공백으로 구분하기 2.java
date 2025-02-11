class Solution {
    public String[] solution(String my_string) {
        Boolean isWord = false;
        int count = 0;
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c != ' ' && isWord==false){
                count ++;
                isWord = true;
            }else if(c ==' '){
                isWord = false;
            }
        }
        String[] answer = new String[count];
        String word = "";
        int idx = 0;
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c != ' '){
                word += c;
            }else if(c == ' ' && !word.equals("")){
                answer[idx] = word;
                idx ++;
                word = "";
            }
        }
        if (!word.equals("")) {
            answer[idx] = word;
        }
        return answer;
    }
}