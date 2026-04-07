class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int exchange;
        int res = numBottles;
        
        while (numBottles >= numExchange){
            exchange = numBottles / numExchange;
            numBottles = (numBottles / numExchange)+ (numBottles % numExchange);
            res+=exchange;
        }
        return res;
    }
};