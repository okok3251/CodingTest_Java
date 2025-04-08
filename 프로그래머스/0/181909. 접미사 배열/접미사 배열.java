class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        int idx = 0;
        for(int i=0; i<len; i++){
            String concat = "";
            for(int j=i; j<len; j++){
                char c = my_string.charAt(j);
                concat += c;
            }
            answer[idx++] = concat;
        }
        for(int i=0; i < len-1; i++){
            for(int j=0; j<len-i-1; j++){
                if(isBiggerThan(answer[j], answer[j+1])){
                    String temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }
        return answer;
    }
    
    public boolean isBiggerThan(String str1, String str2){
        int minLength = str1.length() < str2.length() ? str1.length() : str2.length();
        for(int i = 0; i < minLength; i++){
            if(str1.charAt(i) > str2.charAt(i)){
                return true; 
            }
            else if(str1.charAt(i) < str2.charAt(i)){
                return false; 
            }
        }
        return str1.length() > str2.length(); 
    }

}