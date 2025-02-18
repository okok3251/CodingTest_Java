class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i < right+1; i++){
            int count = 0;
            for(int j=1; j<sqrt(i)+1; j++){
                if(j * j == i){
                    count ++;
                    continue;
                }
                if(i % j == 0){
                    count +=2;
                }
            }
            if(count % 2==0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
    
    
    public static int sqrt(int n){
        int x = n;
        int y = (x+1) / 2;
        while(y < x){
            x = y;
            y = (x + n/x) / 2;
        }
        return x;
    }
}