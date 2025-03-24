class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i< skill_trees.length; i++){
            String skills = skill_trees[i];
            String sktre = "";
            for(int j=0; j< skills.length(); j++){
                char c = skills.charAt(j);
                if(In(skill, c)) sktre+= c;
            }
            if(include(skill, sktre)) answer++;
        }
        return answer;
    }
    
    public static boolean In(String sk, char c){
        for(int i=0; i<sk.length(); i++){
            char s = sk.charAt(i);
            if(s == c) return true;
        }
        return false;
    }
    
    public static boolean include(String s , String t){
        for(int i =0; i<t.length(); i++){
            char c = s.charAt(i);
            char v = t.charAt(i);
            if(c != v) return false;
        }
        return true;
    }
}