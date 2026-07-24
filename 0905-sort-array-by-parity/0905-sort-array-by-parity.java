class Solution {

    public int[] sortArrayByParity(int[] nums) {
     int left =0;
     int right =0;
     int n = nums.length;  
     if(n==1){
        return nums;
     } 
     for(int i=0;i<n;i++){
        if(nums[i]%2 == 0){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
        }
        right++;
     }
    return nums;
    }
}