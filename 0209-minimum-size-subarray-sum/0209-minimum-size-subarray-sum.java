class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l =0;
        int r=0;
        int total=0;
        int res = Integer.MAX_VALUE;
        for(r=0;r<n;r++){
            total = total + nums[r];
            while(total >= target){
                res = Math.min(res,r - l +1);
                total -= nums[l];
                l++;
            }
        }
        return res != Integer.MAX_VALUE? res : 0;
       

    }
}