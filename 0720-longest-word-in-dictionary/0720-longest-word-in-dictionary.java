class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Map<String,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<words.length;i++){
            
            if(words[i].length()==1){
                 map.put(words[i],words[i].length());
            }
           else if(map.containsKey(words[i].substring(0,words[i].length()-1))){
                map.put(words[i],words[i].length());
            }

        }
        
        if(map.isEmpty()){
            return "";
        }
        String returnString="";
        int maxLength=0;
        for(String str: map.keySet()){
            if(map.get(str)>maxLength){
                maxLength=map.get(str);
                returnString= str;
            }
        }
        return returnString;
        
    }
}
