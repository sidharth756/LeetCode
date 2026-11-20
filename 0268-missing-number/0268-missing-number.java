class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_of_n = (n*(n+1))/2;
        int sum=0;
        for(int  a : nums){
            sum = sum + a;
        }
        return sum_of_n - sum;
    }
}