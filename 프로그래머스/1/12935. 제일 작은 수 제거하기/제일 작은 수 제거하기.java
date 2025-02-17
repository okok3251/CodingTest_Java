class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int min_idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[min_idx] > arr[i]){
                min_idx = i;
            }
        }
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[min_idx]){
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}