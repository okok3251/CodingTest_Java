class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                count ++;
            }
        }
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];
        int idx = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0; i < answer.length -1 ; i++){
            for(int j=0; j < answer.length-i-1; j++){
                if(answer[j] > answer[j+1]){
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }
        return answer;
    }
}