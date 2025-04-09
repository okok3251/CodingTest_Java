class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            boolean isIn = false;
            char c = my_string.charAt(i);
            for(int j=0; j<indices.length; j++){
                if(i == indices[j]){
                    isIn = true;
                }
            }
            if(isIn){
                continue;
            }else{
                answer += c;
            }
        }
        return answer;
    }
}