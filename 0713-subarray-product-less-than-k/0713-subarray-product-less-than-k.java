class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        long prod=0;
        int count =0;
        for(int i=0;i<n;i++){
            prod=1;
            for(int j=i;j<n;j++){
                prod = prod * nums[j];
                if(prod < k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}