class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = LCM(n,m);
        answer[1] = GCD(n,m);
        return answer;
    }
    
    public int LCM(int x, int y){
        int minimum = x < y ? x : y;
        int lcm = 0;
        for(int i = 1; i < minimum+1; i++){
            if(x % i == 0 && y % i ==0){
                lcm = i;
            }
        }
        return lcm;
    }
    
    public int GCD(int x, int y){
        int lcm = LCM(x,y);
        return x/lcm * y/lcm * lcm;
    }
}