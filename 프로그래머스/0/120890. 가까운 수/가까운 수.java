import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int[] answer = new int[array.length + 1];
        int idx = 0;
        for(int i=0; i<array.length; i++){
            answer[idx++] = array[i];
        }
        answer[idx] = n;
        QuickSort(answer, 0, answer.length-1);
        idx = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i] == n){
                idx = i;
            }
        }
        if(idx+1 == answer.length) return answer[idx-1];
        if(idx == 0) return answer[idx+1];
        if(answer[idx] - answer[idx-1] <= answer[idx+1] - answer[idx]){
            return answer[idx-1];
        }else{
            return answer[idx+1];
        }
        
        // return 0;
    }
    
    public static void QuickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int pivot = (start + end) / 2;
        int pivotV = arr[pivot];
        int low = start;
        int high = end;
        while(low <= high){
            while(low <= end && arr[low] < pivotV){
                low++;
            }
            while(high >= start && arr[high] > pivotV){
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