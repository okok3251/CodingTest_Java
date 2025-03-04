class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = toLowercase(myString);
        pat = toLowercase(pat);
        
        for(int i = 0; i <= myString.length() - pat.length(); i++) {
            String comparison = subString(myString, i, i + pat.length() - 1);
            if(comparison.equals(pat)) {
                answer = 1;
                break; 
            }
        }
        return answer;
    }
    
    public static String toLowercase(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if(c < 97) {
                result += (char)(c + 32);
            } else {
                result += (char)(c);
            }
        }
        return result;
    }
    
    public static String subString(String s, int start, int end) {
        String result = "";
        for(int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
}
