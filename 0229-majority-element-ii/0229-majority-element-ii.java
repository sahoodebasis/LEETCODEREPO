class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0,majority1=nums[0],majority2=nums[0],n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int x:nums){
           if(majority1==x){
                count1++;
            }
            else if(majority2==x){
                count2++;
            }
            else if(count1==0){
                majority1=x;
                count1++;
            }
            else if(count2==0){
                majority2=x;
                count2++;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int x: nums){
            if(x==majority1){
                count1++;
            }
            else if(x==majority2){
                count2++;
            }
        }
        if(count1>n/3){
            list.add(majority1);
        }
        if(count2>n/3){
            list.add(majority2);
        }
        return list;
    }
}