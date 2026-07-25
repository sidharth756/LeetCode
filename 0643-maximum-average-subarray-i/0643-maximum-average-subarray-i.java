class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxisum = Integer.MIN_VALUE;
        double sum =0;
        if(n==1 && nums[0] <=0)
            return nums[0];
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        maxisum = Math.max(maxisum,sum/k);
        for(int j=k;j<n;j++){
            sum -= nums[j-k];
            sum += nums[j];
            maxisum = Math.max(maxisum,sum/k);
        }
        return maxisum;
    }
}