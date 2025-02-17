class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String result = String.valueOf(x);
        for(int i=0; i< result.length(); i++){
            sum += result.charAt(i) - '0';
        }
        return x % sum == 0 ? true : false;
    }
}