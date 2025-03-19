class Solution {
    public int[] solution(int brown, int yellow) {
        int divisor = 0;
        int total = brown + yellow;
        for(int i=1; i<total+1; i++){
            int width = i;
            int height = total / i;
            if((width-2) * (height - 2) == yellow){
                divisor = i;
            }
        }
        int[] answer = {total/divisor, divisor};
        QuickSort(answer, 0, answer.length-1);
        return answer;
    }
    
    public static void QuickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int pivot = (start + end) / 2;
        int pivotValue = arr[pivot];
        int low = start;
        int high = end;
        
        while(low <= high){
            while(low <= end && arr[low] > pivotValue){
                low++;
            }
            while(high >= start && arr[high] < pivotValue){
                high--;
            }
            
            if(low <= high){
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        if(start < high){
            QuickSort(arr, start, high);
        }
        if(low < end){
            QuickSort(arr, low, end);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}