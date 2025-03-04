class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        int idx = 1;
        for(int i=0; i<count; i++){
            cost += (price * idx++);
        }

        return money >= cost ? 0 : cost-money;
    }
}