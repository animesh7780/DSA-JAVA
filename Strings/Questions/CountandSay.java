public class CountandSay {
    public static String countAndSayAlternative(int n) {
        String result = "1";
        
        //check for all the numbers
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            //assigning the first character to start
            char prev = result.charAt(0);
            
            //checking for the elements and if we find same we increase 
            //count if not we just append the count and then the number 
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == prev) {
                    count++;
                } else {
                    next.append(count).append(prev);
                    prev = result.charAt(j);
                    count = 1;
                }
            }
            
            next.append(count).append(prev);
            result = next.toString();
        }
        
        return result;
    }
}
