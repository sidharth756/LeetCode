class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int s = nums.size();
        int index = -1;
        for(int i = s-2;i>=0;i--){
            if(nums[i]< nums[i+1]){
                index = i;
                break;
            }
        }
        if(index < 0){
            reverse(nums.begin(),nums.end());
        }
        else{
            for(int i = s -1;i > index;i--){
                if(nums[i]> nums[index]){
                    swap(nums[index],nums[i]);
                    break;
                }
            }
            
        reverse(nums.begin()+index+1,nums.end());
        }
        
    }
};