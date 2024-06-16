class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str= new StringBuilder();
        int maxLen=0,curLen=0;
        for(int i=0;i<s.length();i++){
            String currentChar = String.valueOf(s.charAt(i));
            if(str.indexOf(currentChar)==-1){
                str.append(currentChar);
                curLen++;
            }
            else{

                str.delete(0,str.indexOf(currentChar)+1);
                str.append(currentChar);
                curLen=str.length();
            }
            
            maxLen=Math.max(maxLen,curLen);
        }
        return maxLen;
    }
}