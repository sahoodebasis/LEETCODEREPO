class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
      Set <Character> set= new HashSet<>();
        set.add(s.charAt(0));
        int i=0,j=1,max=0;
        while(j!= s.length() ){
           if(set.contains(s.charAt(j))) {
               while(s.charAt(i)!= s.charAt(j)){
                   set.remove(s.charAt(i));
                i++;    
               }
               i++;
               
              
               
               
           }
            else{
                set.add(s.charAt(j));
            
            }
            max= j-i+1>max?j-i+1:max;
            j++;
        }
        return max;
    }
}
                         