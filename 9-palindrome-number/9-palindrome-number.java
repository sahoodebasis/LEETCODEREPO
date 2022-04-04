class Solution {
    public boolean isPalindrome(int x) {
        
//         if(x<0){
//             return false;
//         }
//         int n=x;
//         int sum=0;
//         while(n>0){
//             int r=n%10;
//             sum=10*sum+r;
//             n=n/10;
//         }
//         if(sum==x){
//             return true;
//         }
        
//         return false;
        String str=Integer.toString(x);
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}