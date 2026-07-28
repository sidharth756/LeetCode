class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int tot =0,maxSum=nums[0],curMax =0,minSum =nums[0],curMin = 0;
    for(int  a : nums){
        curMax = Math.max(curMax + a,a);
        maxSum=Math.max(curMax,maxSum);
        curMin = Math.min(curMin + a, a);
        minSum = Math.min(minSum,curMin);
        tot = tot +a;
    }
    return maxSum >0? Math.max(maxSum,tot-minSum) : maxSum;
       
        
    }
}