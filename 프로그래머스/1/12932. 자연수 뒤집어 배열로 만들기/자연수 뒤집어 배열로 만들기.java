class Solution {
    public int[] solution(long n) {
        String result = String.valueOf(n);
        int[] answer = new int[result.length()];
        for(int i=0; i<result.length(); i++){
            answer[i] = result.charAt(result.length()-i-1)-'0';
        }
        return answer;
    }
}