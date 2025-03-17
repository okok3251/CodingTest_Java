class Solution {
    public int[] solution(String s) {
        int epoch = 0;
        int zero = 0;

        while(s.length() > 1){
            int count = 0;
            for(int i=0; i<s.length(); i++){
                int c = s.charAt(i);
                if(c == 48){
                    zero ++;
                }else{
                    count ++;
                }
            }
            s = bin(count);
            epoch++;
            
        }
        return new int[]{epoch, zero};
    }

    public static String bin(int num) {
        String result = "";
        while (num > 0) {
            char c = (char)(num % 2 + '0');
            result += c;
            num /= 2;
        }
        return reverse(result);
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(str.length() - i - 1);
            result += c;
        }
        return result;
    }
}
