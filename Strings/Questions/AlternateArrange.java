/*
 * the question is
 * s1 = ab
 * s2 = cd
 * s3/res/ans must be = acbd
 */


public class AlternateArrange {
    public String arrangeAlter(String s1, String s2){
        String res = "";
        int maxLen = Math.max(s1.length(), s2.length());
        
        for(int i = 0; i < maxLen; i++){
            if(i < s1.length()){
                res += s1.charAt(i);
            }
            if(i < s2.length()){
                res += s2.charAt(i);
            }
        }
        return res;
    }

    //we do not have to run the loops to add the elements we can just do ++ and the index changes

    public String arrangeAlter1(String s1, String s2){
    StringBuilder res = new StringBuilder();
    int totalChars = s1.length() + s2.length();
    int s1Index = 0, s2Index = 0;
    
    for(int i = 0; i < totalChars; i++){
        if(i % 2 == 0){ // Even positions - take from s1
            if(s1Index < s1.length()){
                res.append(s1.charAt(s1Index++));
            }
        }
        else{ // Odd positions - take from s2
            if(s2Index < s2.length()){
                res.append(s2.charAt(s2Index++));
            }
        }
    }
    return res.toString();
}
}
