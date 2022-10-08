class Solution {
    Map<Integer,Integer> hashMap=new HashMap<>();
    
    public int climbStairs(int n) {
        int answer=climbCount(n);
        return answer;
        
    }
    public int climbCount(int n){
        if(n<=2){
            hashMap.put(n,n);
            return n;
        }
        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        else{
            hashMap.put(n,climbCount(n-1)+climbCount(n-2));
            return hashMap.get(n);
        }
    }
}