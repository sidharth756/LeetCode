class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int n = op.length;
        int sum =0;
        for(int i=0;i<n;i++){
            if(op[i].equals("C")){
                sum = sum - st.pop();
            }
            else if(op[i].equals("D")){
                int val = 2*st.peek();
                st.push(val);
                sum = sum + val;
            }
            else if(op[i].equals("+")){
                int temp = st.pop();
                int val = temp + st.peek();
                sum = sum + val;
                st.push(temp);
                st.push(val);
            }else{
                int val = Integer.parseInt(op[i]);
                st.push(val);
                sum += val;
            }
        }
        return sum;
    }
}