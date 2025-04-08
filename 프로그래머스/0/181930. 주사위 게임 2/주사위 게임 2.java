class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && b != c && c != a){
            return a + b + c;
        }
        else if(a == b && b == c && c == a){
            return (a + b + c) * (pow(a,2) + pow(b,2) + pow(c,2)) * (pow(a,3) + pow(b,3) + pow(c,3));
        }
        return (a + b + c) * (pow(a,2) + pow(b,2) + pow(c,2));
    }
    
    public static int pow(int n, int m){
        int result = n;
        for(int i=1; i<m; i++){
            result *= n;
        }
        return result;
    }
}