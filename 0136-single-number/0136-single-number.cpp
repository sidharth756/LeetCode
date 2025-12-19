class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n=nums.size();
        int allxor =0;
        for(int i=0;i<n;i++){
            allxor = allxor ^ nums[i];
        }
    return allxor;
    }

};