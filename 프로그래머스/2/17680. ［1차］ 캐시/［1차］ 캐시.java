import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return cities.length * 5;
        
        String[] cache = new String[cacheSize];
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if(cacheCheck(cache, city)) {
                answer += 1;
                cacheHit(cache, city);
            } else {
                answer += 5;
                cacheMiss(cache, city);
            }
        }
        return answer;
    }

    public static void cacheHit(String[] cache, String city) {
        for(int i = 0; i < cache.length; i++) {
            if(cache[i] != null && cache[i].equals(city)) {
                moveToFront(cache, i);
                break;
            }
        }
    }

    public static void cacheMiss(String[] cache, String city) {
        for(int i = cache.length - 1; i > 0; i--) {
            cache[i] = cache[i - 1];
        }
        cache[0] = city;
    }

    public static boolean cacheCheck(String[] cache, String city) {
        for(int i = 0; i < cache.length; i++) {
            if(cache[i] != null && cache[i].equals(city)) {
                return true;
            }
        }
        return false;
    }

    public static void moveToFront(String[] cache, int index) {
        String temp = cache[index];
        for(int i = index; i > 0; i--) {
            cache[i] = cache[i - 1];
        }
        cache[0] = temp;
    }
}
