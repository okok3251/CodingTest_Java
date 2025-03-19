class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char shap = 35;
        for(int i=0; i<n; i++){
            String raw = "";
            for(int j=0; j<n; j++){
                if((arr1[i]&1) == 1 || (arr2[i]&1) ==1){
                    raw += shap;
                }else{
                    raw += " ";
                }
                arr1[i] >>=1;
                arr2[i] >>=1;
            }
            answer[i] = reverse(raw);
        }
        return answer;
        
    }
    public static String reverse(String s){
        String result = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(s.length()-i-1);
            result += c;
        }
        return result;
    }
    
}
