class Solution {
    public String[] solution(String my_string) {
        int count = 1;
        for(int i=0; i<my_string.length(); i++){
            int c = my_string.charAt(i);
            if(c == 32) count++;
        }
        String[] answer = new String[count];
        int idx = 0;
        String row = "";
        for(int i=0; i<my_string.length(); i++){
            int c = my_string.charAt(i);
            if(c == 32){
                answer[idx++] = row;
                row = "";
            }else if(c != 32){
                row += (char)c;
            }
        }
        answer[idx] = row;
        return answer;
        
    }
}