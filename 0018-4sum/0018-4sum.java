class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length<=3){
            return list;
        }
        Arrays.sort(nums);
       
        long temp=0,temp2=0,remaining=0;
        int k=0,l=0;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                temp=nums[i]+nums[j];
                remaining=target-temp;
                k=j+1;
                l=nums.length-1;
                while(k<l){
                    temp2=nums[k]+nums[l];
                    if(temp+nums[k]+nums[l]==target){
                        set.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                    else if(temp2<remaining){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }

        for(List<Integer> arr: set){
            list.add(arr);
        }
        return list;
        
    }
}