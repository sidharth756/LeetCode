class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxi = 0;
        int n= nums.length;
        int l =0;
        int r =0;
        int len=0;
        int zeros =0;
        while(r<n){
            if(nums[r] == 0) zeros++;
            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                   
                }
                 l++;
            }
            
            maxi = Math.max(maxi,r -  l + 1);
            r++;
        }
        return maxi;
    }
}