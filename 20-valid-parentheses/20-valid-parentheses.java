class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                s1.push(s.charAt(i));
            }
            else{
                switch(s.charAt(i)){
                    case ')': 
                        if(!s1.empty() && s1.peek() =='(' ){
                            s1.pop();
                        }
                        else{
                            s1.push(s.charAt(i));
                        }
                        break;
                    case '}':
                        if(!s1.empty() && s1.peek()=='{'){
                            s1.pop();
                        }
                        else{
                            s1.push(s.charAt(i));
                        }
                        break;
                    case ']':
                        if(!s1.empty() && s1.peek()=='['){
                            s1.pop();
                        }
                        else{
                            s1.push(s.charAt(i));
                        }
                        break;
                    default:
                        break;
                        
                }
            }
        }
        return s1.empty();
    }
}