class Solution {
public:
    int missingNumber(vector<int>& nums) {
        
        int allxor = 0;
        int n = nums.size();
        for(int i=0;i<=n;i++){
            allxor  = allxor ^i;
        }
        for( int num:nums){
            allxor = allxor ^ num;
        }
        return allxor;
    }
};