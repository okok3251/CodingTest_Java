import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        QuickSort(answer, 0, answer.length-1);
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