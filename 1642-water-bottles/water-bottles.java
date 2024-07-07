
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int emp = numBottles;
        while(emp/numExchange >=1){
            sum += emp/numExchange;// for taking to fill the bottle.
            emp = emp/numExchange + emp % numExchange;// this is for taking the remaining bottle + taking the filld bottle
        }
        return sum;
    }
}