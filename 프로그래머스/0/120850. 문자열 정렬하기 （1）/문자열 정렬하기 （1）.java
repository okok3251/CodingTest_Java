import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for(int i=0; i<my_string.length(); i++){
            int c = my_string.charAt(i);
            if(c < 65){
                count++;
            }
        }
        int[] result = new int[count];
        int idx = 0;
        for(int i=0; i<my_string.length(); i++){
            int c = my_string.charAt(i);
            if(c < 65){
                result[idx++] = c-48;
            }
        }
        QuickSort(result, 0, result.length-1);
        return result;
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
                high --;
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