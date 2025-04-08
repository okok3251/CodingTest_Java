import java.util.*;
class Solution {
    public int solution(String binomial) {
        String[] arrBinomial = split(binomial);
        int a = stringToInt(arrBinomial[0]);
        String op = arrBinomial[1];
        int b = stringToInt(arrBinomial[2]);
        if(op.equals("+")) return a + b;
        if(op.equals("-")) return a - b;
        if(op.equals("*")) return a * b;
        return -1;
    }
    
    public static int stringToInt(String number){
        int num = 0;
        int mul = digits(number.length());
        for(int i=0; i<number.length(); i++){
            int c = number.charAt(i) - 48;
            num += c * mul;
            mul /= 10;
        }
        return num;
    }
    public static int digits(int n){
        int digit = 1;
        while(n>1){
            digit *= 10;
            n--;
        }
        return digit;
    }
    
    public static String[] split(String formula){
        String[] result = new String[3];
        String row = "";
        int idx = 0;
        for(int i=0; i<formula.length(); i++){
            int c = formula.charAt(i);
            if(c != 32){
                row += (char)(c);
            }else{
                result[idx++] = row;
                row = "";
            }
        }
        result[idx] = row;
        return result;
    }
    
}