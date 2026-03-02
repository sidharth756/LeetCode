class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        int sum;
        sort(nums.begin(), nums.end());
        int n = nums.size();
        int left =0,right = 0;
        int target = 0;
        sum = 0;
        for(int i =0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0)break;
            target = -(nums[i]);
            left = i+1;
            right = n-1;
            while(left<right){
                sum = nums[left] + nums[right]; 
                if(sum == target){
                    result.push_back({nums[i],nums[left],nums[right]});
                    left++; 
                    right--;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right]== nums[right+1]) right--;
                   
                }
                else if(sum< target ){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
};    