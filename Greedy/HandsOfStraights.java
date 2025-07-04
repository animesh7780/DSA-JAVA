public class HandsOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize == 0) return true;
        return false;
    }
}
