class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            int n = myString.charAt(i);
            if(n == 97){
                answer += (char)(n-32);
            }else{
                if(n < 97 && n != ' ' && n != 65){
                    answer += (char)(n+32);
                }else{
                    answer += (char)(n);
                }
            }
        }
        return answer;
    }
}