class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            int c = myString.charAt(i);
            if(c < 108){
                answer += (char)(108);
            }else{
                answer += (char)(c);
            }
        }
        return answer;
    }
}