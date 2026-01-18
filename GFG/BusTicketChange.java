public class BusTicketChange {
    public boolean canServe(int[] arr) {
        // code here
        int five = 0, ten = 0;

        for(int ar : arr){
            if(ar == 5){
                five++;
            }

            else if(ar == 10){
                if(five == 0) return false;
                five--;
                ten++;
            }

            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five >= 3){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
