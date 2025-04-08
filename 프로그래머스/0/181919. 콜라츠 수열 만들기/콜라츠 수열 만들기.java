class Solution {
    public int[] solution(int n) {
        int num = n;
        int count = 0;
        while(true){
            count++;
            if((num&1) == 0){
                num >>= 1;
            }else if(num == 1){
                break;
            }else{
                num = 3*num + 1;
            }
        }
        int[] answer = new int[count];
        int idx = 0;
        while(true){
            answer[idx++] = n;
            if((n&1) == 0){
                n >>= 1;
            }else if(n == 1){
                break;
            }else{
                n = 3*n + 1;
            }
        }
        return answer;
    }
}