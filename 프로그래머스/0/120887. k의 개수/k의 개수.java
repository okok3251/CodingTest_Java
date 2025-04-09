class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int l=i; l<=j; l++){
            String s = l + "";
            for(int m=0; m<s.length(); m++){
                int c = s.charAt(m) - 48;
                if(c == k) answer++;
            }
        }
        return answer;
        }
    }