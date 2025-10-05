public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int drunks = numBottles;

        // while(numBottles >= numExchange){
        //     drunks++;
        //     numBottles = numBottles - (numExchange - 1);
        // }
        // return drunks;

        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}
