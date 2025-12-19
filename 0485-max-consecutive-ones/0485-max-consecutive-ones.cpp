class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n = nums.size();
        int count =0;
        int large = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                large = max(large,count);
                count =0;
                
            }
            
        }
        
        return max(large,count);
    }
};