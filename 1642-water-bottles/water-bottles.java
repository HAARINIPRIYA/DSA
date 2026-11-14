class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int tot=numBottles;
    int empty = numBottles;
    while(empty>=numExchange){
        int newBottles=empty/numExchange;
        tot+=newBottles; 
        empty=(empty%numExchange)+newBottles;
    }
    return tot;
    }
}