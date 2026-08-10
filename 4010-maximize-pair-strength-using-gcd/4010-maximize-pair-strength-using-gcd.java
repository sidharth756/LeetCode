class Solution {
    public int gcd(int a,int b){
        if(b == 0)
                return a;
        return gcd(b,a % b);
    }
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long max =Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long t = gcd(nums[i],nums[j]);
                long temp = ((long)nums[i] * nums[j])/ (t*t);
                max = Math.max(temp,max);
            }
        }
    return max;
    }
}