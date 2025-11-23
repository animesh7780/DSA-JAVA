public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int x = 0;
        int y = 0;
        int n = secret.length();
        int[] freqSecrets = new int[10];
        int[] freqGuess = new int[10];
         
        for(int i=0; i<n; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                x++;
            }
            else{
                freqSecrets[secret.charAt(i) - '0']++;
                freqGuess[guess.charAt(i) - '0']++;
            }
        }

        for(int i=0; i<10; i++){
            y += Math.min(freqGuess[i], freqSecrets[i]);
        }

        return x + "A" + y + "B";
    }
}
