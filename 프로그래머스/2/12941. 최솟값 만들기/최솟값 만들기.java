// 변수 두개 생성해서 A배열에서 큰값, B배열에서 가장 작은값을 바로 비교해서 진행
// 선택정렬, 버블정렬 이용 시 시간복잡도 초과.
// 퀵정렬로 구현.
import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int sum = 0;
        QuickSort(A, 0, A.length-1,false);
        QuickSort(B, 0, B.length-1, true);
        for(int i=0; i<A.length; i++){
            sum += (A[i] * B[i]);
        }
        return sum;
    }
    
    public static void QuickSort(int[] arr, int start, int end, boolean desc) {
        if (start >= end) {
            return;
        }

        int pivot = (start + end) / 2;
        int pivotValue = arr[pivot];
        int low = start;
        int high = end;

        while (low <= high) {
            while (low <= end && (desc ? arr[low] > pivotValue : arr[low] < pivotValue)) {
                low++;
            }
            while (high >= start && (desc ? arr[high] < pivotValue : arr[high] > pivotValue)) {
                high--;
            }

            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }

        if (start < high) {
            QuickSort(arr, start, high, desc);
        }
        if (low < end) {
            QuickSort(arr, low, end, desc);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}