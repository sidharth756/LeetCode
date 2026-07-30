class Solution {
    public boolean isValid(String si) {
       Stack<Character> st = new Stack<>();
       int n = si.length();
       for(int i=0;i<n;i++){
        char s = si.charAt(i);
        if(s == '{' || s == '(' || s == '[' ){
            st.push(s);
        }
        else{
            if(st.isEmpty())
                return false;
            char x = st.pop();
            if(s == ')' && x!='(')
                return false;
            if(s == '}' && x!='{')
                return false;
            if(s == ']' && x!='[')
                return false;
            
        }
       } 
       return st.isEmpty();
    }
}