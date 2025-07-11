public class LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        int replacement = k;
        for(int i=0; i<n; i++){
            int len = 1;
            for(int j=i+1; j<n;j++){
                if(s.charAt(i) == s.charAt(j)){
                    len++;
                }
                else{
                    if(replacement > 0){
                        len++;
                        replacement--;
                    }
                    else{
                        break;
                    }
                }
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public int characterReplacement1(String s, int k){
        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLen = 0;
        for(int right=0; right<s.length(); right++){
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while(right - left + 1 - maxCount > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
