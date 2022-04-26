class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("I",1);
        map1.put("IV",4);
        map1.put("V",5);
        map1.put("IX",9);
        map1.put("X",10);
        map1.put("XL",40);
        map1.put("L",50);
        map1.put("XC",90);
        map1.put("C",100);
        map1.put("CD",400);
        map1.put("D",500);
        map1.put("CM",900);
        map1.put("M",1000);
        s=s+" ";
        
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char char1=s.charAt(i);
            char char2=s.charAt(i+1);
            String str=Character.toString(char1)+Character.toString(char2);
            if(map1.containsKey(str)){
                sum+=map1.get(str);
                i++;
            }
            else{
                // str=char1+"";
                str=Character.toString(char1);
                sum+=map1.get(str);
            }
            
        }
        return sum;
    }
}