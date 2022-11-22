class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int length=1,max=0,y=0;
        for(int x:set){
            if(!set.contains(x-1)){
                length=1;
                y=x+1;
                while(set.contains(y)){
                    length++;
                    y+=1;
                }
                max=max>length?max:length;
            }
        }
        return max;
    }
}