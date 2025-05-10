import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> totalTimeMap = new HashMap<>();
        
        for(int i=0; i<records.length; i++){
            String[] record = records[i].split(" ");
            int time = mappingTime(record[0]);
            String car = record[1];
            String action = record[2];
            if(action.equals("IN")){
                map.put(car, time);    
            }else{
                int inTime = map.remove(car);
                totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + time - inTime);
            }
        }
        int endTime = mappingTime("23:59");
        for(String car : map.keySet()){
            int inTime = map.get(car);
            totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + endTime - inTime);
        }
        
        ArrayList<String> cars = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(cars);
        
        int[] result = new int[cars.size()];
        int idx = 0;
        for(String car : cars){
            int time = totalTimeMap.get(car);
            result[idx++] = calFee(fees, time);
        }
        return result;
    }
    
    public static int mappingTime(String times){
        String[] time = times.split(":");
        int hour = Integer.parseInt(time[0]) * 60;
        int minutes = Integer.parseInt(time[1]);
        return hour+minutes;
    }
    public static int calFee(int[] fee, int time){
        if(time <= fee[0]){
            return fee[1];
        }
        int overBasicTime = (time - fee[0] + fee[2] - 1) / fee[2];
        return fee[1] + overBasicTime * fee[3];
    }
}