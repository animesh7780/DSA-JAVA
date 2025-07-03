public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        //use the first string as refrence and create the substring to compare with others
        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);

            //comparing it with other strings and finding the common part
            for(int j=1; j<strs.length; j++){

                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }   
        }
        return strs[0];
    }

}
