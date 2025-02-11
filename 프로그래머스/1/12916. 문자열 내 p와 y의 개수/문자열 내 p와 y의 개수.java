class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countS = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'p' || c =='P'){
                countP += 1;
            }
            if(c == 'y' || c =='Y'){
                countS += 1;
            }
        }
        

        return countP == countS ? true : false;
    }
}