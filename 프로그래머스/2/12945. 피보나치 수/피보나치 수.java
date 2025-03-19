class Solution {
    public int solution(int n) {
        int num1 = 0, num2 = 1;
        for(int i=0; i<n; i++){
            int num3 = num1%1234567 + num2%1234567;
            num1 = num2;
            num2 = num3;
        }
        return num1%1234567;
        }
    }