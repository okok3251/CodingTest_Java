class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            String word = "";
            for(int j=0; j < strArr[i].length(); j++){
                int n = strArr[i].charAt(j);
                
                if(i % 2 == 1){
                    if(n >= 97){
                        word += (char)(n-32);
                    }else{
                        word += (char)(n);
                    }
                }else{
                    if(n < 97){
                        word += (char)(n+32);
                    }else{
                        word += (char)(n);
                    }
                }                
            }
            answer[i] = word;

        }
        return answer;
    }
}