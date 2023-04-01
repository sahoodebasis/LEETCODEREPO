class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        
        //[1,2,3]
        //[2,3,-1]
        //[1,2,1,1,2,1]
        
        // 3,2,1
        int temp=0;
        Stack<Integer> stack= new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        System.out.println(stack.toString());
        for(int i=nums.length-1;i>=0;i--){
            temp=nums[i];
            while(!stack.isEmpty() && temp >=stack.peek()){
                stack.pop();
            }
            
            nums[i]=stack.isEmpty()? -1:stack.peek();
            stack.push(temp);
        }
        
        return nums;
        
    }
}