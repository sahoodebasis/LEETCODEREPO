class Solution {
    public int romanToInt(String s) {
         
    int n = s.length();
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    
    int sum = 0;
    
    for (int i = n-1; i >= 0; i--) {
        char ch = s.charAt(i);
        
        if (i > 0 && map.get(ch) > map.get(s.charAt(i-1))) {
            int val = map.get(ch) - map.get(s.charAt(i-1));
            sum += val;
            i--;
        }
        else sum += map.get(ch);
    }
    
    return sum;
    }
}