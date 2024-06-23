class Solution {
    List<List<Integer>> list=  new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,11);
        findPermutation(nums,arr,0);
        return list;
    }
    
    public void findPermutation(int [] nums, int [] arr,int index) {
        if(index==nums.length){
            List<Integer> subList= new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                subList.add(arr[i]);
            }
            list.add(subList);
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(arr[i]==11){
                arr[i]=nums[index];
                findPermutation(nums,arr,index+1);
                arr[i]=11;
            }
        }
    }
}
//https://www.youtube.com/watch?v=XUQ0iZ94CGg&ab_channel=Let%27sCodeTogether
//https://www.geeksforgeeks.org/introduction-to-backtracking-data-structure-and-algorithm-tutorials/