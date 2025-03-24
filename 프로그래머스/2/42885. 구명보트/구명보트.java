import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        QuickSort(people,0,people.length-1);
        
        int start = 0, end = people.length-1;
        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
            }else{
                end--;
            }
            answer++;
        }
        return answer;
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