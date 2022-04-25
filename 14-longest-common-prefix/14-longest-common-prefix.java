class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        // StringBuilder str= new StringBuilder();
        // int min=strs[0].length() <=strs[strs.length-1].length()?strs[0].length():strs[strs.length-1].length();
        // for(int i=0;i<min;i++){
        //     if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
        //         str.append(strs[0].charAt(i));
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return str.toString();
        int min=strs[0].length() <=strs[strs.length-1].length()?strs[0].length():strs[strs.length-1].length();
        int count=0;
        for(int i=0;i<min;i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        if(count==0){
            return "";
        }
        else{
            return strs[0].substring(0,count);
        }
        
    }
}