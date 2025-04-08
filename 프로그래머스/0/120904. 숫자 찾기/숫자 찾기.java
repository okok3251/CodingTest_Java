class Solution {
    public int solution(int num, int k) {
        String num_str = num + "";
        for(int i=0; i<num_str.length(); i++){
            int c = num_str.charAt(i) - 48;
            if(c == k){
                return i+1;
            }
        }
        return -1;
    }
}