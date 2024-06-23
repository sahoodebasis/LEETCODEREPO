class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int arraySize=strs.length;
        int minSize=strs[0].length()<strs[arraySize-1].length()? strs[0].length():strs[arraySize-1].length();
        
        int count=0;
        for(int i=0;i<minSize;i++){
            if(strs[0].charAt(i)==strs[arraySize-1].charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        if(count==0)
            return "";
        else
            return strs[0].substring(0,count);
    }
}