class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1] >= intervals[i+1][0]){
                
                intervals[i+1][0]=intervals[i+1][0]<intervals[i][0]?intervals[i+1][0]:intervals[i][0];
                
                intervals[i+1][1]=intervals[i+1][1] < intervals[i][1]?intervals[i][1]:intervals[i+1][1];
            }
            else{
                list.add(new int[]{intervals[i][0],intervals[i][1]});            
        }
        }
        list.add(new int[]{intervals[intervals.length-1][0],intervals[intervals.length-1][1]});
        return list.toArray(new int [0][0]);
    }
}