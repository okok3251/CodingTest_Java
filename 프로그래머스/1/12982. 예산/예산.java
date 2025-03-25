import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        SelectSort(d);
        System.out.println(Arrays.toString(d));
        int sum = 0;
        for(int i=0; i<d.length; i++){
            if(d[i] + sum <= budget){
                sum += d[i];
                count++;
            }
        }
        return count;
    }
    public static void SelectSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min_idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            swap(arr, i, min_idx);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}