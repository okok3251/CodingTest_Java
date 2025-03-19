import java.util.*;

public class Solution {
    public int solution(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) ==0){
                n >>= 1;
            }else{
                count++;
                n -= 1;
            }
        }
        return count;
    }
}