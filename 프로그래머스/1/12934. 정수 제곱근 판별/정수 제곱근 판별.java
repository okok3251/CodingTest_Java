
class Solution {
    public long solution(long n) {
        long result = sqrt(n);
        return result*result == n ? (result+1)*(result+1) : -1;
    
    
    
}
    
    public static long sqrt(long n) {
        long x = n;
        long y = (x + 1) / 2;  // 초기 추정값

        while (y < x) {
            x = y;
            y = (x + n / x) / 2;  // 뉴턴-랩슨 방법 (반복적으로 제곱근 계산)
        }
        return x;
    }
    
}