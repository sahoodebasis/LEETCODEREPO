class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int count1=0,count2=0,majorElement1=nums[0],majorElement2=nums[0], n=nums.length;
        
        for(int i=0;i<n;i++){
            if(majorElement1==nums[i]){
                count1++;
            }
            else if(majorElement2==nums[i]){
                count2++;
            }
            
           else if(count1==0){
                count1++;
                majorElement1=nums[i];
            }
            else if (count2==0){
                count2++;
                majorElement2=nums[i];
            }
             else {
                count1--;
                count2--;
            }
           
        }
      //here we found out the major elements. Now we need to count each element count and check whether it is greater than n/3.
        count1=0;
        count2=0;
        
        for(Integer x: nums){
            if(x==majorElement1){
                count1++;
            }
           else if(x==majorElement2){
                count2++;
            }
        }
        
        if(count1>n/3){
            list.add(majorElement1);
        }
        if(count2>n/3){
            list.add(majorElement2);
        }
        
        return list;
        
    }
}