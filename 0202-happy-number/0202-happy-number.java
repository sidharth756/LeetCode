class Solution {
    public int getsum(int n){
        int ans = 0;
        while(n>0){
            ans = ans+ ((n%10)*(n%10));
            n=n/10;
        }
        return ans;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> hash = new HashSet<>();
        while(n!=1 && !hash.contains(n)){
            hash.add(n);
            n = getsum(n);
        }
        return n==1;
    }
}