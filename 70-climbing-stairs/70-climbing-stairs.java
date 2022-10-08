class Solution {
    // Map<Integer,Integer> hashMap=new HashMap<>();
    
    public int climbStairs(int n) {
        // hashMap.put(1,1);
        // hashMap.put(2,2);
        // int answer=climbCount(n);
        // return answer;
        if(n<=2){
            return n;
        }
        int firstVal=1;
        int secondVal=2;
        int thirdVal=0;
        for(int i=3;i<=n;i++){
            thirdVal=firstVal+secondVal;
            firstVal=secondVal;
            secondVal=thirdVal;
        }
        return thirdVal;
    }
    // public int climbCount(int n){
    //     if(hashMap.containsKey(n)){
    //         return hashMap.get(n);
    //     }
    //     else{
    //         hashMap.put(n,climbCount(n-1)+climbCount(n-2));
    //         return hashMap.get(n);
    //     }
    // }
}