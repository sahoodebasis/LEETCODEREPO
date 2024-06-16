class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str= new StringBuilder();
        int maxLen=0,curLen=0;
        for(int i=0;i<s.length();i++){
            String currentChar = String.valueOf(s.charAt(i));
            System.out.println("currentChar "+currentChar);
            if(str.indexOf(currentChar)==-1){
                System.out.println("str.indexOf(currentChar) "+str.indexOf(currentChar));
                str.append(currentChar);
                curLen++;
                System.out.println("curLen "+curLen);
            }
            else{

                str.delete(0,str.indexOf(currentChar)+1);
                 System.out.println("str after delete "+str);
                str.append(currentChar);
                 System.out.println("str+ "+str);
                curLen=str.length();
                 System.out.println("curLen+ "+curLen);
            }
            
            maxLen=Math.max(maxLen,curLen);
             System.out.println("maxLen "+maxLen);
        }
        return maxLen;
    }
}